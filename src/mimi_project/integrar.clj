
(ns mimi-project.integrar)

;namespace function names the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; This function computes the area under the curve 
; of a set of predefined functions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(def map-function
  ;Define a map with the formulae of every function
  {:Linear (fn [x] (+ x 1))
   :Square (fn [x] (* x x))})


(defn time-series 
  ;;This function compute the time series wich will be 
  ;;use for the integration. 
  [lower-bound upper-bound]  
    (range lower-bound upper-bound 0.100)
  ) 


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;; 

(defn function-image [sequence] 
    ((doseq [n  sequence] (println (+ n 1))))
  ) 

(function-image (range 10))


(get map-function :Square) ;;Here we have the function back
(get map-function :hola2) ;;Here we have the function back
(map-function :Square) ;;Here we have the function back  

(get {:a 1 :b (fn suma [x] (+ x 1))} :b)
(defn suma [x] (+ x 1))

(apply  (get {:a 1 :b (fn sumatoria [x] (+ x 1))} :b) [1])

;;Si puedo establecer usar una funcion dentro de una lista

(defn -main-int []
  (println "Please, To compute the area under the curve")
  (println "enter the lower bound") (flush)
  (let
   [lower-bound (read)]

    (println lower-bound)
    (println "Now, enter the upper bound") (flush)
    (println "Thank you, the range of values selected is:")
    (let
     [upper-bound (read)]
      (println upper-bound)

      (cond (> upper-bound lower-bound)
            ((lazy-seq vectorcito   (range lower-bound upper-bound 0.100)))
            ;(print "Upper-bound mayor a lower-bound")
            (< upper-bound lower-bound)
            (let [vectorcito (range upper-bound lower-bound 0.100)]
              print vectorcito)
            ;(print "Lower bound mayor a upper bound")
            )

      (println "Now please select the function to be integrated:")
      (flush)
      (println "1. Square pulse.")
      (println "2. Linear Fucntion.")
      (println "Select the number, please.")
      (let
       [function-type (read)]
        (cond (= function-type 1) (print "Square pulse selected")
              (= function-type 2) (print "Linear function selected"))))))

(-main-int)
