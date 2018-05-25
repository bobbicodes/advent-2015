(ns day01)

(defn parse-step [floor step]
  (case step
    \( (inc floor)
    \) (dec floor)
    floor))

(defn parse-floor
  [steps]
  (reduce parse-step 0 steps))

 (defn -main []
   (println (parse-floor (slurp "input"))))

; --- Part Two ---

; Now, given the same instructions,
; find the position of the first character that causes him to enter the basement (floor -1).
; The first character in the instructions has position 1, the second character has position 2, and so on.

; For example:

; ) causes him to enter the basement at character position 1.
; ()()) causes him to enter the basement at character position 5.
; What is the position of the character that causes Santa to first enter the basement?
