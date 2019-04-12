(ns clj-project-euler.p004)

(defn- palindrome? [x]
  (= (reverse (str x)) (seq (str x))))

(defn solve []
  (apply max
         (for [a (range 100 1000)
               b (range a 1000)
               :let [sum (* a b)]
               :when (palindrome? sum)]
           sum)))
