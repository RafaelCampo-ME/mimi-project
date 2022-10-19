
(ns mimi-project.integrar)

(:author "Rafael Campo")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; This function computes the area under the curve 
; of a set of predefined functions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(def map-function
  ;Define a map with the formulae of every function
  {:Linear (fn [x] (+ x 1)) :Square (fn sq [x] (* x x))})


(defn time-series
  ;;This function compute the time series wich will be 
  ;;use for the integration. 
  [lower-bound upper-bound delta-x]
  (range lower-bound upper-bound delta-x))


(defn function-image [sequence]
;This function return the image of the function (the function evaluated in every
;point of the time series)
  (for
    [n  sequence]
    (apply (get map-function :Square) [n])))


(defn riemman-aprox [imagen delta-x]
  ;;This function return the Rieman aproximation for a image 
  
  (loop [indice 0 suma 0]
    (if (< indice (count imagen))
      (recur (inc indice)
              (+ suma (* delta-x (nth imagen indice))))
      suma))) 


(defn -main [lower-bound upper-bound delta-x] 
  ;;Get the integral of a  quadatic function
  (let [image  (function-image 
      (time-series lower-bound upper-bound delta-x))]
    (riemman-aprox image delta-x)    
    ) 
)

