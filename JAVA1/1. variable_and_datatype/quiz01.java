package Testing;

public class Test {

	public static void main(String[] args) {
		String name = "박보라";
		int age = 25;
		
		int num1 = 3;
		int num2 = 5;
		int num3 = 7;
		
		System.out.println("이름 : " + name + ", 나이 : " + age);
		System.out.println();
		
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println();
		
		for (int i = 1; i < 4; i++) {
			System.out.println(num3 + " X " + i + " = " + (num3 * i));
		}
		
	}

}
