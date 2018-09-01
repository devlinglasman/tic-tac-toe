(ns tic-tac-toe.messages)

(def welcome-message "Welcome to Tic Tac Toe!")

(def ask-for-choice "Please pick a tile number.")

(def picked-tile-message "Here is the choice: ")

(def draw-message "It was a draw...")

(defn winner-message
  [player-mark]
  (str "Player " player-mark " won!"))