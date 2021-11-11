package theTrumpCard;

public class TrumpCard {
	// 트럼프 카드 한장
	// 모양과 숫자만 있음 
	private String cardShape;
	private int cardNum;
	
	public TrumpCard() {
		
	}
	
	public TrumpCard(String cardShape, int cardNum) {
		this.cardShape = cardShape;
		this.cardNum = cardNum;
	}
	
//	public void setShape(String cardShape) {
//		this.cardShape = cardShape;
//	}
//	
//	public void setNum(int cardNum) {
//		this.cardNum = cardNum;
//	}
//	
	public String getShape() {
		return cardShape;
	}
	
	public int getNum() {
		return cardNum;
	}
}
