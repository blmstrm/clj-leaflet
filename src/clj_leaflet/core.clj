(ns clj-leaflet.core
  (require [clojure.string :as s])
  )


(def noisy-words ["the" "featuring" "feat." "ft." "f/" "&" "Radio edit" ","])

(defn in?
 "Returns true if item i is in collection coll" 
 [coll i]
 (some #(= i %) coll))

(defn remove-words
  "Removes unwanted words from string list."
  [ss]
  (remove #(in? noisy-words %) ss))

(defn clean-up
  "Cleans string s by removing words not interesting during search.
  (e.g. The and featuring variations."
  [search-string]
  (let [dirty-string  (s/split (s/lower-case search-string) #" ")]
  (->>
    dirty-string
   remove-words
   (s/join " "))))

(defn get-search-map
  "Takes search arguments in the shape of artist a, song s and other o and returns a map with keys :artist, :song, :other, :search-string where :search-string is all variables as one string in the shape of artist song other."
  ([artist track]
   (get-search-map artist track ""))
  ([artist  track other]
  {:artist artist
   :track track
   :other (if (= "" other) nil other) 
   :search-string (s/join " " (map clean-up [artist track other]))}))
