package Inheritance_ex;

public class Person {
	protected String name;
	
	public Person() {
		System.out.println("응애~~");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("내 이름은 " + this.name + "입니다.");
	}

}
