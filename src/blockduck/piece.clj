(ns blockduck.piece)

(defn corners-for-monimo [location]
  [{:x (- (:x location) 1) :y (- (:y location) 1)}
   {:x (+ (:x location) 1) :y (- (:y location) 1)}
   {:x (- (:x location) 1) :y (+ (:y location) 1)}
   {:x (+ (:x location) 1) :y (+ (:y location) 1)}])

(defn monimo-at [location]
  (let [x (:x location)
        y (:y location)]
    {:x x :y y :corners (fn corners-for-monimo )}))
