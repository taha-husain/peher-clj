(ns peher.controllers.app-controller
 (:require [peher.views.index :as index]
           [peher.services.music :as m]
           [cheshire.core :refer [generate-string]]))

(defn index
 []
 (index/page
  (generate-string (m/music-list))))
