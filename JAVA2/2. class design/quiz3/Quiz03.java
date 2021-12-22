package Testing;

public class Quiz03 {

	public static void main(String[] args) {
		Product product = new Product("새우깡", 1300, "2022-12-22");
		
		System.out.println("이름: " + product.getName());
		System.out.println("가격: " + product.getPrice());
		System.out.println("유통기한: " + product.getDate());
		
		System.out.println("제품 5개의 가격 : " + product.CalculateProductNum(5));
		System.out.println("제품 13개의 가격 : " + product.CalculateProductNum(13));
		product.isSelling();
		
	}

}
