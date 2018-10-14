(defn sum [x y]    
    (+ x y))


(def a (read-line))
(def b (read-line))

(println (sum (Integer/parseInt a) (Integer/parseInt b))) 