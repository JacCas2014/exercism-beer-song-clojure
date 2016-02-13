(ns beer-song)

(defn pluralise [number]
  (when (> number 1)
    "s"))

(defn it-or-one [number]
  (if (> number 1)
    "one"
    "it"))

(defn bottles-of-beer-left [number]
  (if (> number 1)
    (str (- number 1) " bottle" (pluralise (- number 1)))
    "no more bottles"))

(defn verse [number]
  (if (= number 0)
    "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n"
    (str number " bottle" (pluralise number) " of beer on the wall, " number " bottle" (pluralise number) " of beer.\nTake " (it-or-one number) " down and pass it around, " (bottles-of-beer-left number) " of beer on the wall.\n")))

(defn sing
  ([number])
  ([number number]))
