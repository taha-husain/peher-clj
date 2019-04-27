(ns peher.views.index
  (:require [hiccup.core :refer :all]))

(defn page
 [list]
 (html
  [:div {:data-video (first list)
         :data-autoplay "0"
         :data-loop "1"
         :id "youtube-audio"}]
  [:script {:src "https://www.youtube.com/iframe_api"}]
  [:script {:src "https://cdn.rawgit.com/labnol/files/master/yt.js"}]
  [:h1 "Welcome to Peher"]))
