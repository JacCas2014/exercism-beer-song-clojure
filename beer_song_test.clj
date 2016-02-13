(ns beer-song-test
  (:require [clojure.test :refer :all]
            [beer-song :refer :all]
            [midje.sweet :refer :all]))

(def verse-8 "8 bottles of beer on the wall, 8 bottles of beer.\nTake one down and pass it around, 7 bottles of beer on the wall.\n")
(def verse-2 "2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n")
(def verse-1 "1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n")
(def verse-0 "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")

(def song-8-6 "8 bottles of beer on the wall, 8 bottles of beer.\nTake one down and pass it around, 7 bottles of beer on the wall.\n\n7 bottles of beer on the wall, 7 bottles of beer.\nTake one down and pass it around, 6 bottles of beer on the wall.\n\n6 bottles of beer on the wall, 6 bottles of beer.\nTake one down and pass it around, 5 bottles of beer on the wall.\n")
(def song-3-0 "3 bottles of beer on the wall, 3 bottles of beer.\nTake one down and pass it around, 2 bottles of beer on the wall.\n\n2 bottles of beer on the wall, 2 bottles of beer.\nTake one down and pass it around, 1 bottle of beer on the wall.\n\n1 bottle of beer on the wall, 1 bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.\n\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall.\n")

(facts "verse function"
       (fact "returns verse 8 when given number 8"
             (beer-song/verse 8) => verse-8)
       (fact "returns verse 2 when given number 2"
             (beer-song/verse 2) => verse-2)
       (fact "returns verse 1 when given number 1"
             (beer-song/verse 1) => verse-1)
       (future-fact "returns verse 0 when given number 0"
             (beer-song/verse 0) => verse-0))

(future-facts "sing function"
       (fact "returns song 8 to 6 when given number 8 and 6"
             (beer-song/sing 8 6) => song-8-6)
       (fact "returns song 3 to 0 when given number 3 only"
             (beer-song/sing 3) => song-3-0))

(facts "pluralise"
       (fact "returns 's' if greater than 1"
             (pluralise 2) => "s")
       (fact "returns '' if less than or equal to 1"
             (pluralise 1) => nil))

