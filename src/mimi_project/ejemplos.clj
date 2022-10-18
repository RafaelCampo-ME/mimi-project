(ns mimi-project.ejemplos)

(defn connect-db [] 
  ;;Recursive function in clojure
  (println "Trying to connect")
  (let [connected (>= (rand-int 5) 4)]
    (if connected "connected" (connect-db))))

(connect-db)

(defn recursiva 
  [input] 
  (println "intentando" input)
  (let [condicion (>= input 5)]
    (if condicion "true" (recursiva (+ input 1))) 
    )
  )

(recursiva 1)

(defn connect-db ([max-tries] (connect-db max-tries 0))
  
  ;;Recursive function in clojure
  (println "Trying to connect")
  (let [connected (>= (rand-int 5) 4)
        conection-failed (> current-tries max-tries)
        
        ]
    (if connected "connected" (connect-db))))

