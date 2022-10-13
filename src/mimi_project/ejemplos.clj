(ns mimi-project.ejemplos)

(defn connect-db []
  ;;Recursive function in clojure
  (println "Trying to connect")
  (let [connected (>= (rand-int 5) 4)]
    (if connected "connected" (connect-db))))

(connect-db)

 
(. System (nanoTime)) 