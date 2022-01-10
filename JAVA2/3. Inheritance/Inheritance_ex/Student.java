package Inheritance_ex;

public class Student extends Person {
	private String major;
	
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		// 부모 클랫의 name 필드값 저장 -> super(name)
		// super.name = name;
		this.name = name;
		this.major = major;
	}
	
	// 오버라이드: 부모 클래스에 있는 메소드를 자식 클래스에서 재정의
	@Override
	public void introduce() {
		System.out.println("내 전공은 " + this.major + "입니다.");
		super.introduce();
	}
}
