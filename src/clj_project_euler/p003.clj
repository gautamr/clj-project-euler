(ns clj-project-euler.p003)

(defn factor [num cur]
  (if (= num cur)
	  num
	  (if (zero? (mod num cur))
	    (factor (/ num cur) cur)
	    (factor num (inc cur)))))
