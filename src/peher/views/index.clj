(ns peher.views.index
  (:require [hiccup.core  :refer :all]
            [hiccup.page  :refer :all]))

(defn page
 [music-list]
 (html5 {:lang "en"}
  [:head
   [:title "Peher"]
  ]
  [:body
   [:div {:id "yt-player" :data-music-list music-list}]
   (include-js "js/bundle.js")
   (include-js "https://www.youtube.com/iframe_api")
   (include-js "https://cdn.rawgit.com/labnol/files/master/yt.js")
  ]))
