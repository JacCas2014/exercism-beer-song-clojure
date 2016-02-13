(ns beer-song)

(defn pluralise [number]
  (when (> number 1)
    "s"))

(defn verse [number]
  (cond
    (> number 1) (str number " bottle" (pluralise number) " of beer on the wall, " number " bottle" (pluralise number) " of beer.\nTake " (it-or-one number) " down and pass it around, " (bottles-of-beer-left number) " of beer on the wall.\n")
    (= number 1) (str number " bottle of beer on the wall, " number " bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
    :else "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"))

(defn sing
  ([number])
  ([number number]))
