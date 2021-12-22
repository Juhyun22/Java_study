package Testing;

public class Quiz01 {

	public static void main(String[] args) {
		// getter -> return / setter -> type set 
		
		Rectangle rect1 = new Rectangle(30,50);
		System.out.println("넓이: " + rect1.Area() + "cm^2");
		System.out.println("둘레: " + rect1.Round() + "cm");
		
		Rectangle rect2 = new Rectangle(10, 10);
		System.out.println("넓이: " + rect2.Area() + "cm^2");
		System.out.println("둘레: " + rect2.Round() + "cm");
		
	}
}
