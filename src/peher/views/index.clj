(ns peher.views.index
  (:require [hiccup.core  :refer :all]
            [hiccup.page  :refer :all]))

(defn page
 []
 (html
  [:div {:id "yt-player"}]
  (include-js "js/bundle.js")
  (include-js "https://www.youtube.com/iframe_api")
  (include-js "https://cdn.rawgit.com/labnol/files/master/yt.js")))
