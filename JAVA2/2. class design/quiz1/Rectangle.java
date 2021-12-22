package Testing;

public class Rectangle {
	// 속성 : field
	private int width;
	private int height;
	
	// 행위 : method
	public Rectangle (int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로 " + width + "cm, 세로 " + height + "cm 사각형이 만들어 졌습니다.");
	}
	
	public int Area() {
		return (width * height);
	}
	
	public int Round() {
		return (width + height) * 2;
	}
}
