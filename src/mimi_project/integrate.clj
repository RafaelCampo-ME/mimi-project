
(ns integrate) ;namespace function names the program

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; This function computes the area under the curve 
; of a set of predefined functions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def map-function {:Square (fn [x] (+ x 1)) 
                   :Triangle (fn [x] (+ x 1)) }) 

(get map-function :Square) ;;Here we have the function back
(get map-function :hola2) ;;Here we have the function back
(map-function :Square) ;;Here we have the function back  

(get {:a 1 :b (fn suma [x] (+ x 1))} :b)
(defn suma [x] (+ x 1))

(apply  (get {:a 1 :b (fn sumatoria [x] (+ x 1))} :b) [1])

(apply  (get map-function :Square) [1])

;;Si puedo establecer usar una funcion dentro de una lista
