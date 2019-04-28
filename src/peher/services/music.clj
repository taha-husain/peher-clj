(ns peher.services.music
 (:require [peher.services.time :as t]
           [peher.services.raga :as r]
           [clj-http.client     :as http]
           [cheshire.core       :as json]
           [aero.core           :as conf]
           [clojure.string      :as s]))

(def config (conf/read-config (clojure.java.io/resource "config.edn")))
(def api-key (:api-key config))

(defn current-ragas
 []
 ((t/current-watch) r/raga-list))

(defn fetch-list-from-yt
 []
 (let [ragas (current-ragas)
       q-str (first ragas)]
  (http/get "https://www.googleapis.com/youtube/v3/search"
            {:accept :json,
             :query-params {"q"          q-str,
                            "part"       "snippet"
                            "key"        api-key
                            "maxResults" 50}})))

(defn parse-music-list
 [yt-response]
 (let [{body :body} yt-response
       items        (-> body (json/parse-string keyword) :items)]
   (map #(hash-map :id    (-> % :id :videoId)
                   :title (-> % :snippet :title)) items)))

(defn music-list
 []
 (let [yt-response (fetch-list-from-yt)]
  (parse-music-list yt-response)))
