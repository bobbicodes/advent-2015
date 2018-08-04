(ns day02b)

(defn parse-dimensions
  [s]
  (->> (re-matches #"(\d+)x(\d+)x(\d+)" s)
       rest
       (map #(Integer/parseInt %))))

(defn ribbon-cost
  [s]
  (let [[l w h]        (parse-dimensions s)
        [s1 s2 _]      (sort [l w h])
        present-ribbon (+ (* 2 s1) (* 2 s2))
        bow-ribbon     (* l w h)]
    (+ present-ribbon bow-ribbon)))

(defn -main []
(->> (line-seq (clojure.java.io/reader "input"))
         (map ribbon-cost) 
         (reduce +) 
         prn))
