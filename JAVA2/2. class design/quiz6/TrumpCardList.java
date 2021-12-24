package Testing;

import java.util.Random;

public class TrumpCardList {
	private TrumpCard[] trumpCards = new TrumpCard[52];
	
	public TrumpCardList() {
		
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard("spade", (i + 1));
			trumpCards[i] = trumpCard;
		}
		
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard("heart", (i + 1));
			trumpCards[i + 13] = trumpCard;
		}
		
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard("diamond", (i + 1));
			trumpCards[i + (13 * 2)] = trumpCard;
		}
		
		for (int i = 0; i < 13; i++) {
			TrumpCard trumpCard = new TrumpCard("club", (i + 1));
			trumpCards[i + (13 * 3)] = trumpCard;
		}
	}
	
	public void mix() {
		Random rand = new Random();
		
		for (int i = 0; i < 1000; i++) {
			int randNum = rand.nextInt(52); // 0 ~ 52
			
			TrumpCard swap = trumpCards[0];
			trumpCards[0] = trumpCards[randNum];
			trumpCards[randNum] = swap;
		}
	}
	
	public void printCards() {
		for (int i = 0; i < trumpCards.length; i++) {
			System.out.print(trumpCards[i].getShape() + trumpCards[i].getNumber() + " ");
			if (i != 0 && i % 13 == 0) {
				System.out.println();
			}
		}
	}
	
}





