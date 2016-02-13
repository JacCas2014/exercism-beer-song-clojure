(ns beer-song)

(defn pluralise [number]
  (when (> number 1)
    "s"))

(defn verse [number]
  (cond
    (> number 1) (str number " bottle" (pluralise number) " of beer on the wall, " number " bottle" (pluralise number) " of beer.\nTake one down and pass it around, " (str (- number 1) " bottle" (pluralise (- number 1))) " of beer on the wall.\n")
    (= number 1) (str number " bottle of beer on the wall, " number " bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
    :else "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"))

(defn sing
  ([number])
  ([number number]
   "8 bottles of beer on the wall, 8 bottles of beer.\nTake one down and pass it around, 7 bottles of beer on the wall.\n\n7 bottles of beer on the wall, 7 bottles of beer.\nTake one down and pass it around, 6 bottles of beer on the wall.\n\n6 bottles of beer on the wall, 6 bottles of beer.\nTake one down and pass it around, 5 bottles of beer on the wall.\n"))
