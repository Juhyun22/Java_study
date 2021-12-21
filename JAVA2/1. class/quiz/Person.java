package Testing;

import java.time.LocalDate;

public class Person {
	// field
	String name;
	String yyyymmdd;
	String gender;
	
	// method
	public void Hello() {
		System.out.println("Hello!!");
	}
	
	public void Walking() {
		System.out.println("Walking~~");
	}
	
	public void Introduce() {
		System.out.println("My name is " + name + ". I am a " + gender + ".");
	}
	
	public void Age() {
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		int birthYear = Integer.valueOf(yyyymmdd.substring(0, 4));
		int age = year - birthYear + 1;
		System.out.println("I am " + age + " years old.");
	}
}
