package Trumpcard_problem;

import java.util.Random;

public class TrumpCardTest {

	public static void main(String[] args) {
		TrumpCard trumpcard = new TrumpCard();
		
		String[] card = trumpcard.trumpCardAll();
		
		Random rand = new Random();
		
		String temp;
		for (int i = 0; i < 1000; i++) {
			int randNum = rand.nextInt(52);
			temp = card[0];
			card[0] = card[randNum];
			card[randNum] = temp;
		}
		
		for (int i = 0; i < card.length; i++) {
			if (i % 13 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(card[i] + "   ");
		}
		System.out.println();
		System.out.print("끝!");
	}

}
