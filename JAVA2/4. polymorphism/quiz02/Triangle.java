package quiz02;

public class Triangle extends Shape {
	public Triangle(double base, double height) {
		this.name = "삼각형";
		this.area = (base * height) / 2;
	}
}
