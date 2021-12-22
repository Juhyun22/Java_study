package Testing;

import java.time.LocalDate;

public class Product {
	// 속성 : field
	private String name;
	private int price;
	private String date;
	
	// 행위 : method
	public Product(String name, int price, String date) {
		this.name = name;
		this.price = price;
		this.date = date;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public String getDate() {
		return this.date;
	}
	
	public int CalculateProductNum (int num) {
		return num * price;
	}
	
	public void isSelling() {
		LocalDate now = LocalDate.now();
		LocalDate productDate = LocalDate.parse(date);
		
		// 기한 잘 생각해서 넣기 !!
		if (productDate.isBefore(now)) {
			System.out.println("판매 불가 상품");
		} else if (productDate.isAfter(now)) {
			System.out.println("판매 가능 상품");
		} else {
			System.out.println("당일만 판매하는 상품");
		}

	}
	
}
