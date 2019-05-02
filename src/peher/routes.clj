(ns peher.routes
  (:require [compojure.route                  :as    route]
            [compojure.core                   :refer [defroutes context GET POST]]
            [cheshire.core                    :refer [generate-string]]
            [peher.controllers.app-controller :refer [index music-list]]))

(defroutes app-routes
  (GET "/"           [] (index))
  (GET "/music-list" [] (generate-string (music-list)))
  (route/not-found "<h1>Page not found</h1>"))
