package Testing;

import java.time.LocalDate;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 문자열 변환
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		System.out.println();
		
		// 2. 문자열 정수 변환
		LocalDate now = LocalDate.now();
		int year = now.getYear();
		String birth = "19950721";
		int birthYear = Integer.valueOf(birth.substring(0, 4));
		int age = year - birthYear + 1;
		System.out.println(age + "세");
		System.out.println();
		
		// 3. 문자열 검색
		// split는 string 배열[]에 저장됨!!!!
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] getWord = sentence.split(" ");
		System.out.println("단어 개수: " + getWord.length);
	}

}
