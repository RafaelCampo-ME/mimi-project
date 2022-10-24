(ns mimi-project.derivar)
(:author "Rafael Campo")

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;This function can performance numerical derivatives

(def   ^{:sources  {:ADIC "https://onlinelibrary.wiley.com/doi/abs/10.1002/%28SICI%291097-024X%28199712%2927%3A12%3C1427%3A%3AAID-SPE138%3E3.0.CO%3B2-Q" 
                    :ADIC2 "https://www.researchgate.net/publication/2346856_Algorithms_and_Design_for_a_Second-Order_Automatic_Differentiation_Module"}}  fuentes) 

(meta #'fuentes)



(def map-function
  ;Define a map with the formulae of every function
  {:Linear (fn [x] (+ x 1)) :Square (fn sq [x] (* x x)) :Sin (fn sin [x] (Math/sin x)) })


(defn differentiation
;;This method return a series of points who represents the derivatate 
;;of the function in every point using the newton formula 
  [lower-bound upper-bound delta-x] 
  (let [image-series  (for [n  (range lower-bound upper-bound delta-x)]
                        (* 2 n))]
  (loop [ indice 0 
          derivate []
          ]
    (if (indice < (count image-series))
       
      (conj derivate ((* (nth image-series indice) (nth image-series (+ indice 1))) / delta-x)) 
      )
      derivate
      )))


(differentiation 1 2 0.01) 








