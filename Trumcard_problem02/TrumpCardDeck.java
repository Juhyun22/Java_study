package theTrumpCard;

import java.util.Random;

public class TrumpCardDeck {
	// 카드 13개 각각 초기화
	// 카드 52개 배열에 초기화
	// 카드 섞기
	// 카드 출력 
	
	private int cardNum = 13; // 각각 카드 개수
	TrumpCard[] allTrumpCard = new TrumpCard[52];
	
	public TrumpCardDeck() {
		
		// 스페이드(Spade) 
		for (int i = 0; i < cardNum; i++) {
			TrumpCard trumpCard = new TrumpCard("spade", i + 1);
			this.allTrumpCard[i + cardNum * 0] = trumpCard;
		}
		
		// 하트(Heart) 
		for (int i = 0; i < cardNum; i++) {
			TrumpCard trumpCard = new TrumpCard("heart", i + 1);
			this.allTrumpCard[i + cardNum * 1] = trumpCard;
		}
		
		// 다이아몬드(Diamond)
		for (int i = 0; i < cardNum; i++) {
			TrumpCard trumpCard = new TrumpCard("diamo", i + 1);
			this.allTrumpCard[i + cardNum * 2] = trumpCard;
		}
		
		// 클로버(Clover)  
		for (int i = 0; i < cardNum; i++) {
			TrumpCard trumpCard = new TrumpCard("clove", i + 1);
			this.allTrumpCard[i + cardNum * 3] = trumpCard;
		}
		
	}
	
	public void mixCards() {
		Random rand = new Random();
		
		TrumpCard temp;
		for (int i = 0; i < 1000; i++) {
			int randNum = rand.nextInt(52);
			temp = allTrumpCard[0];
			allTrumpCard[0] = allTrumpCard[randNum];
			allTrumpCard[randNum] = temp;
		}
	}
	
	public void printCards() {
		for (int i = 0; i < allTrumpCard.length; i++) {
			if (i !=0 && i % cardNum == 0) {
				System.out.println();
			}
			System.out.print(allTrumpCard[i].getShape() + allTrumpCard[i].getNum() + " ");
		}
	}
}
