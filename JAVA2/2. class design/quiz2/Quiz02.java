package Testing;

public class Quiz02 {

	public static void main(String[] args) {
		Circle cir1 = new Circle();
		
		cir1.setRad(8);
		
		System.out.println("원의 넓이 : " + cir1.calculateArea());
		System.out.println("원의 둘레 : " + cir1.getRound());
		System.out.println("원 25개의 넓이 : " + cir1.calculateArea(25));
	}

}
