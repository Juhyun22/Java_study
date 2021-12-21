package Testing;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO: stu1 객체 생성 및 값 넣기
		Class stu1 = new Class();
		
		stu1.name = "유재석";
		stu1.age = 21;
		stu1.className = "java";
		stu1.phoneNumber = "0102343223";
		
		// 결과값 출력
        System.out.println(stu1.name);
        System.out.println(stu1.age);
        System.out.println(stu1.className);
        System.out.println(stu1.phoneNumber);
        stu1.isAdult();

        System.out.println();
		
		// TODO: stu2 객체 생성 및 값 넣기
		Class stu2 = new Class();
		
		stu2.name = "이효리";
		stu2.age = 17;
		stu2.className = "java";
		stu2.phoneNumber = "01096482734";
		
		// 결과값 출력
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.className);
		System.out.println(stu2.phoneNumber);
		stu2.isAdult();
		
	}
}
