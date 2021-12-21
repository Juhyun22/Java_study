package Testing;

public class Class {
	// 속성: field
	String name;
	int age;
	String className;
	String phoneNumber;
	
	// 행위: method
	void isAdult() {
		if (age >= 20) {
			System.out.println(name + "은 성인입니다.");
		} else {
			System.out.println(name + "은 미성년자입니다.");
		}
	}
	
}
