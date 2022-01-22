package com.jimscott.Week6FinalProject;
//		2.	Create a class called App with a main method.
public class App {

	public static void main(String[] args) {

//		3.	Instantiate a Deck and two Players, call the shuffle method on the deck.
		
		Deck deck = new Deck();
		Player player1 = new Player("1");
		Player player2 = new Player("2");
		deck.shuffle();

//		4.	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
		
		for (int i = 0; i < 52; i++) {
			if ( i % 2 == 0) {
				player1.draw(deck);
			} else {
				player2.draw(deck);
			}
		}
		
//		5.	Using a traditional for loop, iterate 26 times and call the flip method for each player.
//			a.	Compare the value of each card returned by the two player’s flip methods. 
//				Call the incrementScore method on the player whose card has the higher value.
		
		for (int i = 0; i < 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
				if (player1Card.getValue() > player2Card.getValue()) {
					player1.incrementScore();
				} else if (player1Card.getValue() < player2Card.getValue()) {
					player2.incrementScore();
				}
			}
		
//		6.	After the loop, compare the final score from each player.
//		7.	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher 
//			or if they are both the same.
		
		System.out.printf("Player 1 score = %d\n", player1.getScore());
		System.out.printf("Player 2 score = %d\n", player2.getScore());
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 wins");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("Player 2 wins");
		} else {
			System.out.println("Draw");
		}
		
	}

}
