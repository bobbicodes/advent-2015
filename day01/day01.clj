; Puzzle input saved as input

(count (re-seq #"\(" "((("))
;=> 3

(count (re-seq #"\(" (slurp "input")))
;=> 3537

(count (re-seq #"\)" (slurp "input")))
;=> 3463

(- 3537 3463)
;=> 74

; --- Part Two ---

; Now, given the same instructions,
; find the position of the first character that causes him to enter the basement (floor -1).
; The first character in the instructions has position 1, the second character has position 2, and so on.

; For example:

; ) causes him to enter the basement at character position 1.
; ()()) causes him to enter the basement at character position 5.
; What is the position of the character that causes Santa to first enter the basement?
