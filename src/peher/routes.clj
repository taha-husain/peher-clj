(ns peher.routes
  (:require [compojure.route                  :as    route]
            [compojure.core                   :refer [defroutes context GET POST]]
            [peher.controllers.app-controller :refer [index]]))

(defroutes app-routes
  (GET "/"           [] (index))
  (route/not-found "<h1>Page not found</h1>"))
