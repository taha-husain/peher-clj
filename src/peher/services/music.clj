(ns peher.services.music
 (:require [peher.services.time :as t]
           [peher.services.raga :as r]
           [clj-http.client     :as http]
           [cheshire.core       :as json]
           [aero.core           :as conf]))

(def config (conf/read-config (clojure.java.io/resource "config.edn")))
(def api-key (:api-key config))

(defn current-watch
 []
 (first
  (some
   (fn [watch]
    (if (.contains (val watch) (t/current-hour))
     watch))
   t/timings)))

(defn current-ragas
 []
 ((current-watch) r/raga-list))

(defn fetch-list-from-yt
 []
 (http/get "https://www.googleapis.com/youtube/v3/search"
           {:accept :json,
            :query-params {"q"    (first (current-ragas)),
                           "part" "snippet"
                           "key"  api-key
                           "maxResults" 50}}))

(defn parse-music-list
 [yt-response]
 (let [{body :body} yt-response
       items        (-> body (json/parse-string keyword) :items)]
   (map #(-> % :id :videoId) items)
  ))

(defn music-list
 []
 (let [yt-response (fetch-list-from-yt)]
  (parse-music-list yt-response)))
