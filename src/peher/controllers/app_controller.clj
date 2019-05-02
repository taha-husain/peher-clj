(ns peher.controllers.app-controller
 (:require [peher.views.index :as index]
           [peher.services.music :as m]))

(defn index
 []
 (index/page))

(defn music-list
 []
 (m/music-list))
