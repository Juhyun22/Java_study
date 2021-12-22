package Testing;

public class Circle {
	// 속성 : field
	private double rad;
	private double pi = 3.14;
	
	// 행위 : method
	public void setRad(double rad) {
		this.rad = rad;
	}
	
	// 필요 없음
//	public double getRad() {
//		return rad;
//	}
	
//	public double getArea(int num) {
//		return pi * rad * rad * num;
//	}
	
	public double calculateArea() {
		return pi * rad * rad;
	}
	
	// 개수에 따른 넓이 
	// overloading : 메소드 이름은 같은데 파라미터의 개수가 다르거나, 파라미터의 타입이 다른 경우 
	// 다른 메소드로 인지하고 일치하는 메소드로 자동 호출되는 것 !!!! 
	public double calculateArea(int num) {
		return pi * rad * rad * num;
	}
	
	
	public double getRound() {
		return 2 * pi * rad;
	}
}
