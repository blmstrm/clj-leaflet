(ns clj-leaflet.core-test
  (:require [clojure.test :refer :all]
            [clj-leaflet.core :refer :all]))

(def existing-element "existing_string")

(def non-existing-element "non_existing_string")

(def test-collection ["existing_string" "resisting_string"])

(def dirty-words '("the" "featuring" "feat." "Beatles"))

(def clean-words '("Beatles"))

(def dirty-string "The Featuring feat. Beatles")

(def clean-string "beatles")

(def artist "Vanilla Ice")

(def track "Ice Ice Baby")

(def other "Or is it Under Preassure?")

(def search-map {:artist "Vanilla Ice" :track "Ice Ice Baby" :other "Or is it Under Preassure?" :search-string "vanilla ice ice ice baby or is it under preassure?"})


(deftest test-element-in-collection
  (testing "Does an element exist in a collection."
  (is (true? (in? test-collection existing-element))))
  )

(deftest test-element-not-in-collection
  (testing "Does an element not exist in a collection."
  (is (nil? (in? test-collection non-existing-element))))
  )

(deftest test-remove-words
  (testing "Remove certain words from string."
    (is (= clean-words (remove-words dirty-words)))))

(deftest test-clean-up
  (testing "Cleaning up string by removing words."
  (is (= clean-string (clean-up dirty-string)))))

(deftest test-get-search-map
  (testing "Retrieving map to use in further searches for song, artist and other."
    (is (= search-map (get-search-map artist track other)))))
