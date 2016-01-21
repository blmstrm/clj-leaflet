[![Build Status](https://travis-ci.org/blmstrm/clj-leaflet.svg?branch=master)](https://travis-ci.org/blmstrm/clj-leaflet)
[![Clojars](https://img.shields.io/clojars/v/clj-leaflet.svg)](http://clojars.org/clj-leaflet)
[![Dependencies
Status](https://jarkeeper.com/blmstrm/clj-leaflet/status.svg)](https://jarkeeper.com/blmstrm/clj-leaflet)
# clj-leaflet

A small library to generate useful search strings when searching for music
online.

## Usage

Call the function `get-search-map` with the arguments `artist`, `track`
and `other`, with `other` being optional and receive in return a clojure
map with keys `:artist` `:track` `:other` and `:search-string`.
`:search-string` will be a sanitized string of all the other variables
combined.

## License

The MIT License (MIT)

Copyright (c) 2015 Karl Blomström

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.

