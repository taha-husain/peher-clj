(ns peher.core
  (:require [peher.routes             :refer [app-routes]]
            [ring.middleware.resource :refer [wrap-resource]]))

(def app
 (-> app-routes
     (wrap-resource "public")))
