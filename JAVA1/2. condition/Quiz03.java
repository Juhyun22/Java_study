package Testing;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 음수 양수 판별
		System.out.print("정수를 입력하세요 : ");
		int number = scan.nextInt();
		
		if (number < 0) {
			System.out.println("음수입니다.");
		}
		System.out.println();
		
		// 2. 학점 출력
		System.out.print("점수를 입력 하세요 : ");
		int score = scan.nextInt();
		
		score = score / 10;
		switch (score) {
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		System.out.println();
		
		// 3. 비만도 구하기
		System.out.print("bmi 수치를 입력하세요 : ");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) {
			System.out.println("정상");
		} else if (bmi <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		System.out.println();
		
		scan.close();
	}

}
