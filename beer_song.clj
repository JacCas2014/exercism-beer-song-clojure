(ns beer-song)

(defn pluralise [number]
  (when (> number 1)
    "s"))

(defn verse [number]
  (cond
    (> number 1) (str number " bottle" (pluralise number) " of beer on the wall, " number " bottle" (pluralise number) " of beer.\nTake one down and pass it around, " (str (dec number) " bottle" (pluralise (dec number))) " of beer on the wall.\n")
    (= number 1) (str number " bottle of beer on the wall, " number " bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
    :else "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"))

(defn add-current-verse-to-result [result coll]
  (let [result-and-verse (str result (verse (first coll)))]
    (if (= 1 (count coll))
      result-and-verse
      (str result-and-verse "\n"))))

(defn create-verses [coll result]
  (if (= 0 (count coll))
    result
    (recur (rest coll) (add-current-verse-to-result result coll))))

(defn sing
  ([startNumber]
   (sing startNumber 0))
  ([startNumber endNumber]
   (create-verses (range startNumber (- endNumber 1) -1) "")))
