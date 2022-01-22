package com.jimscott.Week6FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
//		c.	Player
//			i.	Fields
//				1.	hand (List of Card)
//				2.	score (set to 0 in the constructor)
//				3.	name
//			ii.	Methods
//				1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
//				2.	flip (removes and returns the top card of the Hand)
//				3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
//				4.	incrementScore (adds 1 to the Player’s score field)
	
		private List<Card> hand = new ArrayList<Card>();
		private int score;
		private String name;

		public Player() {
			score = 0;
			
		}
		public Player(String newName) {
			name = newName;
			score = 0;
			
		}
		public void describe() {
			System.out.printf("Player %s shows the cards: \n", name);
			for (Card card : hand) {
			card.describe();
			
			}
		}
		public Card flip() {
			return hand.remove(0);
			
		}
		public void draw(Deck deck) {
			hand.add(deck.draw());
		
		}
		public void incrementScore() {
			score++;
			
		}
		public int getScore() {
			return score;
			
		}

}
