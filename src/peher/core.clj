(ns peher.core
  (:require [peher.routes       :refer     [app-routes]]))

(def app
  app-routes)
