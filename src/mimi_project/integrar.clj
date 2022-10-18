
(ns mimi-project.integrar)

(:author "Rafael Campo")
;namespace function names the program

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
  [lower-bound upper-bound]
  (range lower-bound upper-bound 0.100))


(defn function-image [sequence]
;This function return the image of the function (the function evaluated in every
;point of the time series)
  (for
   [n  sequence]
    (apply (get map-function :Square) [n])))


(defn area-under-curve [image size]
;This function return the image of the function (the function evaluated in every
;point of the time series)

  (for
   [n  (range size)]
    (let [in-range (< n size)]
      (cond in-range (nth image n)
            (== n 0)  "It's a zero"
            :else     "nothing"))))

(area-under-curve (function-image (range 20)) (count (range 20)))


(defn area-integration ([rango] (area-integration rango 0))
  ([rango intento]
   (let
    [no-rango (== rango intento)
     en-rango (<  intento rango)]

     (cond no-rango (print "ultimo intento" intento)
           en-rango  ((println "hola") (area-integration rango (+  intento 1)))
           :else (area-integration rango (+  intento 1))))))

(area-integration 10)





(nth imagencita 4)


;;This will be the backbones of my aproximation
(loop [x 0 result 0]
  (if (< x 10)
    (recur (inc  x)
           (+ result x))
    result))












(defn -main-int []
  (println "Please, To compute the area under the curve")
  (println "enter the lower bound") (flush)
  (let [lower-bound (read)]

    (println lower-bound)
    (println "Now, enter the upper bound") (flush)
    (println "Thank you, the range of values selected is:")
    (let [upper-bound (read)]
      (println upper-bound)

      (cond (> upper-bound lower-bound)
            (let [vectorcito   (range lower-bound upper-bound 0.100)]
              print vectorcito)
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
      (let [function-type (read)]
        (cond (= function-type 1) (print "Square pulse selected")
              (= function-type 2) (print "Linear function selected"))))))

(-main-int)
