(ns peher.services.time
 (:require [clj-time.core :as t]))

(defn current-time
 []
 (t/time-now))

(defn current-hour
 []
 (t/hour (current-time)))

(def timings
 {:first   (range 0 3)
  :second  (range 3 6)
  :third   (range 6 9)
  :fourth  (range 9 12)
  :fifth   (range 12 15)
  :sixth   (range 15 18)
  :seventh (range 18 21)
  :eighth  (range 21 24)})

(defn current-watch
 []
 (first
  (some
   (fn [watch]
    (if (.contains (val watch) (current-hour))
     watch))
   timings)))
