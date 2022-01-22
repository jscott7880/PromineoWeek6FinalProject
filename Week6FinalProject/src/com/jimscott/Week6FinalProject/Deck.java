package com.jimscott.Week6FinalProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	
//	b.	Deck
//		i.	Fields
//			1.	cards (List of Card)
//		ii.	Methods
//			1.	shuffle (randomizes the order of the cards)
//			2.	draw (removes and returns the top card of the Cards field)
//			3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
	
		List<Card> cards = new ArrayList<Card>();
		List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");

		public Deck() {
			for (int i = 2; i < 15; i++) {
			for (String suit : suits) {
				cards.add(new Card(i, suit));
			}

		}

	}
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	public Card draw() {
		return cards.remove(0);
		
	}

}
