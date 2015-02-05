(defproject cqrs-clj "1.0.0-SNAPSHOT"
  :description "cqrs lib"
  :url ""
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [common-clj "1.0.0-SNAPSHOT"]
                 [prismatic/schema "0.3.0"]
                 [io.vertx/clojure-api "1.0.3"]
                 [com.hazelcast/hazelcast "3.2"]
                 [org.fusesource.leveldbjni/leveldbjni-all "1.8"]
                 [clojurewerkz/elastisch "2.1.0"]
                 [org.mapdb/mapdb "0.9.9"]]
  :exclusions [[org.clojure/clojure]])
