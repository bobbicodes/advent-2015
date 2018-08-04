(ns day02a)

(defn parse-dimensions
  [s]
  (->> (re-matches #"(\d+)x(\d+)x(\d+)" s)
       rest
       (map #(Integer/parseInt %))))

(defn wrapping-paper-cost
  [s]
  (let [[l w h]      (parse-dimensions s)
        surface-area (+ (* 2 l w) (* 2 w h) (* 2 h l))
        slack        (min (* l w) (* w h) (* h l))]
    (+ surface-area slack)))

(defn -main []
(->> (line-seq (clojure.java.io/reader "input"))
         (map wrapping-paper-cost) 
         (reduce +) 
         prn))
