(ns tic-tac-toe.messages)

(def welcome-message "Welcome to Tic Tac Toe!")

(def ask-mode "Please enter 1 for human-vs-human, 2 for human-vs-comp or 
                  3 for comp-vs-comp.")

(def invalid-mode "Uhoh, that's not a valid mode!")

(def ask-for-tile-choice "Please pick a tile number.")

(def already-picked-message "Uhoh, that one's taken!")

(def choice-out-of-range-message "Uhoh, that's not in range!")

(def not-integer-message "Uhoh, that's not a valid number!")

(def picked-tile-message "Here is the choice: ")

(def draw-message "It was a draw...")

(def ask-replay "Great match! Now, enter 'y' to replay or 'n' to quit.")

(def not-y-or-n "That's not a 'y' or a 'n'!")

(def goodbye "Thanks for playing, ta-ra!")

(defn winner-message
  [player-mark]
  (str "Player " player-mark " won!"))
