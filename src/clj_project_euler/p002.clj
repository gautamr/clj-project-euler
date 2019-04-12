(ns clj-project-euler.p002)

(defn fibo [] (map first (iterate (fn [[a b]] [b (+ a b)]) [1N 2N])))

(defn solve [max]
  (->> (fibo)
       (take-while #(< % max))
       (filter even?)
       (reduce +)))
