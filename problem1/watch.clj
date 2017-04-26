(require 'cljs.build.api)

(cljs.build.api/watch "src"
                      {:main 'problem1.core
                       :output-to "out/main.js"})
