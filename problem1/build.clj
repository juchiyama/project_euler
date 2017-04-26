(require 'cljs.build.api)

;; (cljs.build.api/build "src" {:output-to "out/main.js"})
(cljs.build.api/build "src"
                      {:main 'problem1.core
                       :output-to "out/main.js"})
                      
