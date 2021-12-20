package Testing;

public class Quiz01 {

	public static void main(String[] args) {
		// 문자열 정수 변환
		String birthday = "1995";
		int age = 2021 - Integer.valueOf(birthday) + 1;
		
		System.out.println(age + "세");
	}
}
