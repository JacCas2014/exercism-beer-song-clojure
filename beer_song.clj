(ns beer-song)

(defn pluralise [number]
  (when (> number 1)
    "s"))

(defn verse [number]
  (str number " bottle" (pluralise number) " of beer on the wall, " number " bottle" (pluralise number) " of beer.\nTake one down and pass it around, " (- number 1) " bottle" (pluralise (- number 1)) " of beer on the wall.\n"))

(defn sing
  ([number])
  ([number number]))
