(ns mimi-project.core
  (:gen-class)
  (:use incanter.core)
  (:use incanter.io)
  (:use mimi-project.integrar)
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")

  (read-dataset "/mimi-project/doc/prueba.csv" :header true))

(-main)
(-main-int)


(defn demo [x y] (* 2 x y))
(demo 2 3)

(demo 2 (demo 2 3))

