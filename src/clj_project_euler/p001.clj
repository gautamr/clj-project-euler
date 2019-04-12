(ns clj-project-euler.p001)

(defn solve[]
  ()
  (->> (range 1000)
       (filter #(zero? (min (mod % 3) (mod % 5))))
       (reduce +))
  )
