(ns looping-is-recursion)

(defn power [base exp]
  (let [helper (fn [acc n]
                 (cond
                  (zero? n) 1
                  (= 1 n) acc
                  :else (recur (* acc base) (dec n))))]
    (helper base exp)))

(defn last-element [a-seq]
  (cond 
   (empty? a-seq) nil
   (empty? (rest a-seq)) (first a-seq)
   :else (recur (rest a-seq))))

(defn seq= [seq1 seq2]
  (cond
   (and (empty? seq1) (empty? seq2)) true
   (or (empty? seq1) (empty? seq2)) false
   (= (first seq1) (first seq2)) (recur (rest seq1) (rest seq2))
   :else false))

(defn find-first-index [pred a-seq]



)

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

