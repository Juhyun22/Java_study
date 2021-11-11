package Trumpcard_problem;

public class TrumpCard {
	private int cardNum = 13;
	private String[] trumpSpade = new String[cardNum];
	private String[] trumpHeart = new String[cardNum];
	private String[] trumpDiamond = new String[cardNum];
	private String[] trumpClub = new String[cardNum];
	
	public TrumpCard() {
		for (int i = 0; i < cardNum; i++) {
			this.trumpSpade[i] = "s" + (i + 1);
			this.trumpHeart[i] = "h" + (i + 1);
			this.trumpDiamond[i] = "d" + (i + 1);
			this.trumpClub[i] = "c" + (i + 1);
		}
	}
	
	public String[] trumpCardAll() {
		String[] trumpCard = new String[cardNum*4];
		for (int i = 0; i < cardNum; i++) {
			trumpCard[i + cardNum * 0] = this.trumpSpade[i];
			trumpCard[i + cardNum * 1] = this.trumpHeart[i];
			trumpCard[i + cardNum * 2] = this.trumpDiamond[i];
			trumpCard[i + cardNum * 3] = this.trumpDiamond[i];
		}
		
		return trumpCard;
	}
	
} // class
