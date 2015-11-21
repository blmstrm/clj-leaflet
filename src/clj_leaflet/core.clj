(ns clj-leaflet.core)

(defn clean-up
  "Cleans string s by removing words not interesting during search.
  (e.g. The and featuring variations."
  [s]
  () 
  )

(defn get-search-map
  "Takes search arguments in the shape of artist a, song s and other o and returns a map with keys :artist, :song, :other, :search-string where :search-string is all variables as one string."
  [artist track album]
  (let [artist (clean-up a)
        track r 
        other (clean-up o)
        ]) 
  )
