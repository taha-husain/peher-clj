(defproject peher "0.1.0"
  :description "Music! Anytime."

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure       "1.10.0"]
                 [hiccup                    "1.0.5"]
                 [ring                      "1.7.1"]
                 [compojure                 "1.6.1"]
                 [aero                      "1.1.3"]
                 [clj-time                  "0.15.0"]
                 [clj-http                  "3.9.1"]
                 [cheshire                  "5.8.1"]
                 [log4j                     "1.2.15"
                                            :exclusions [javax.mail/mail
                                                         javax.jms/jms
                                                         com.sun.jdmk/jmxtools
                                                         com.sun.jmx/jmxri]]]

  :main ^:skip-aot peher.core

  :target-path "target/%s"

  :plugins [[lein-ring "0.12.4"]]

  :ring {:handler peher.core/app
         :port 3009}

  :profiles {:uberjar {:aot :all}})
