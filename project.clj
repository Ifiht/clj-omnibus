(defproject clj-omnibus "0.1.0-SNAPSHOT"
	:description "An omnibus of clojure knowledge"
	:dependencies [[org.clojure/clojure "1.7.0"]]
	:repl-options {
		:init-ns clj-omnibus
		:prompt (fn [ns] (str "\033[00;35m" ns "\033[00m=> " ))
		:welcome (println "type \"(help)\" for help.")})