package Testing;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 2의 제곱함수 
		System.out.print("제곱값을 구할 숫자를 입력하세요: ");
		int num = scan.nextInt();
		
		int squ = getSquared(num);
		
		System.out.println(num + "의 제곱은 " + squ + "이다.");
		System.out.println();
		
		// 2. 평균 구하기 함수
		// 밑으로 한줄 복사는 option + command + 화살표
		System.out.print("점수를 입력하세요: ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		int score4 = scan.nextInt();
		
		double avg = getAverage(score1, score2, score3, score4);
		System.out.println("평균은 " + avg);
		System.out.println();
		
		// 3. 몫과 나머지 출력 함수
		System.out.print("숫자와 나눌 수를 입력하세요: ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
		
		// 4. 홀짝 함수
		System.out.print("숫자를 입력하세요: ");
		int number = scan.nextInt();
		
		boolean result = oddOrEven(number);
		
		System.out.println(result);
		
		
		scan.close();
		
	}
	
	// 1. 2의 제곱 함수 
	public static int getSquared(int x) {
		return x * x;
	}
	
	// 2. 평균 구하기 함수 
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double average = (double)(score1 + score2 + score3 + score4) / 4;
		return average;
	}
	
	// 3. 몫과 나머지 출력 함수 
	public static void printQuotientRemainder(int number1, int number2) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("몫: " + quotient + "\n나머지: " + remainder);
	}

	// 4. 홀짝 함수
	// 3항 연산자!!! 
	public static boolean oddOrEven(int number) {
//		if (number % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
		
//		if (number % 2 == 0) {
//			return true;
//		}
//		return false;
		
		return (number % 2 == 0)? true : false;
	}
}
