package Testing;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 숫자 비교
		System.out.print("숫자를 입력하세요 : ");
		int number = scan.nextInt();
		
		if (number > 10) {
			System.out.println("10보다 큽니다.");
		}
		System.out.println();
		
		// 2. 수 비교 
		System.out.print("두 개의 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1 + "이 더 큽니다.");
		} else if (num1 < num2) {
			System.out.println(num2 + "이 더 큽니다.");
		} else {
			System.out.println(num1 + "와 " + num2 + "는 같습니다.");
		}
		System.out.println();
		
		// 3. 시험 합격
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		
		if (score >= 70) {
			System.out.println("합격입니다.");
		}
		System.out.println();
		
		// 4. 홀짝 검사
		System.out.print("수를 입력하세요 : ");
		int oddEven = scan.nextInt();
		
		if ((oddEven % 2) == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println();
		
		
		scan.close();
	}

}
