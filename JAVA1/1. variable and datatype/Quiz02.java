package Testing;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 변수 출력
		// 변수 재활용 가능!!!!
		int score1 = 90;
		int score2 = 80;
		
		char grade1 = 'A';
		char grade2 = 'B';
		
		double avg1 = 4.0;
		double avg2 = 3.0; // 소수일때, java에서는 기본적으로 double로 취급함. 그래서 float num = 4.0f;이렇게 선언해야함. 
		
		System.out.println("시험 성적이 " + score1 + "점 이상이면 " + grade1 + "학점이고 평점은 " + avg1 + "입니다.");
		System.out.println("시험 성적이 " + score2 + "점 이상이면 " + grade2 + "학점이고 평점은 " + avg2 + "입니다.");
		
		// 2. 실수 연산
		int number1 = 33;
		double number2 = 35.325;
		double result = number1 * number2;
		
		System.out.println("두 수의 곱 : " + result);
		
		// 3. 날짜 구하기
		int hour = 943;
		int day = hour / 24;
		int theHour = hour % 24;
		
		System.out.println(hour + "시간은 " + day + "일 " + theHour + "시간 입니다.");
		
		// 4. 도형 넓이 구하기
		int width = 8;
		int height = 9;
		int rectangular = width * height;
		int triangle = (width * height) / 2;
		
		System.out.println("사각형의 넓이: " + rectangular);
		System.out.println("삼각형의 넓이: " + triangle);
		
	}

}
