
(ns mimi-project.integrar)

;namespace function names the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; This function computes the area under the curve 
; of a set of predefined functions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(def map-function 
  ;Define a map with the formulae of every function
  {:Linear (fn [x] (+ x 1)) 
   :Square (fn [x] (* x x))}
  ) 


(get map-function :Square) ;;Here we have the function back
(get map-function :hola2) ;;Here we have the function back
(map-function :Square) ;;Here we have the function back  

(get {:a 1 :b (fn suma [x] (+ x 1))} :b)
(defn suma [x] (+ x 1))

(apply  (get {:a 1 :b (fn sumatoria [x] (+ x 1))} :b) [1])

;;Si puedo establecer usar una funcion dentro de una lista

(defn -main-int []
  (println "Please, To compute the area under the curve")
  (print " enter the lower bound") (flush)
  (let 
    [lower-bound (read)]
    (print lower-bound)
    (println "Now, enter the upper bound") (flush) 
    (let 
      [upper-bound (read)]
      (print upper-bound)

      (cond (> upper-bound lower-bound)
            (let [vectorcito (range lower-bound upper-bound 0.100)]
              print vectorcito)
            ;(print "Upper-bound mayor a lower-bound")
            :else
            (let [vectorcito (range upper-bound lower-bound 0.100)]
              print vectorcito)
            ;(print "Lower bound mayor a upper bound")
            )))) 
