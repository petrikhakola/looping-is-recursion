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
  (loop [p pred seq a-seq counter 0]
    (cond 
     (empty? seq) nil
     (p (first seq)) counter
     :else (recur p (rest seq) (inc counter)))))

(defn avg [a-seq]
  (loop [sum 0 counter 0 seq a-seq]
    (cond 
     (empty? seq) (/ sum counter)
     :else (recur (+ sum (first seq)) (inc counter) (rest seq)))))

(defn toggle [a-set elem]
  (if (contains? a-set elem)
    (disj a-set elem)
    (conj a-set elem)))

(defn parity [a-seq]
  (loop [pset #{} seq a-seq]
    (cond
     (empty? seq) pset
     :else (recur (toggle pset (first seq)) (rest seq)))))

(defn fast-fibo [n]
  (loop [i 0 f1 0 f2 1]
    (cond
     (= n i) f1
     :else (recur (inc i) f2 (+ f1 f2)))))

(defn cut-at-repetition [a-seq]
  [":("]

  
)

