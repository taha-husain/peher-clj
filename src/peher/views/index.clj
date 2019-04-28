(ns peher.views.index
  (:require [hiccup.core  :refer :all]
            [hiccup.page  :refer :all]))

(defn page
 [list]
 (html
  [:div {:data-video (:id (first list))
         :data-autoplay "0"
         :data-loop "1"
         :id "youtube-audio"}]
  [:p (:title (first list))]
  (include-js "https://www.youtube.com/iframe_api")
  (include-js "https://cdn.rawgit.com/labnol/files/master/yt.js")
  (include-js "js/bundle.js")))
