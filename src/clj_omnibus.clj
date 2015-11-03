(ns clj-omnibus)

(defn help []
	(print "This is a comglumerate of clojure knowledge, structured for easy reference.
Available options are:
1. atoms		: Lists all atoms used by clojure
2. structs		: Lists all data structures used by clojure
3. funcs		: Lists all function types and parameters used by clojure
-. (help)		: Displays this help message.\n"))

;========================~ Atoms ~===============================;
(def atoms '(true false nil))

;=====================~ Data Structures ~========================;
(def structs {list (), vector [], hash {}, set #{}})

;======================~ Functions ~=============================;