(ns clj-project-euler.p005)

(defn gcd [a b] (if (zero? b) a (recur b (mod a b)))) ; greatest common divisor
(defn lcm [a b] (/ (* a b) (gcd a b)))

(defn solve []
  (reduce #(lcm %1 %2) (range 1 21)))
