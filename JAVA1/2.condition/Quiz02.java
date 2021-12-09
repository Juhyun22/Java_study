package Testing;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 두 점수 합격
		System.out.print("두 점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		if (score1 >= 70 && score2 >= 70) {
			System.out.println("합격입니다.");
		}
		System.out.println();
		
		// 2. 공배수 구하기
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if ((num % 2) == 0 && (num % 3) == 0) {
			System.out.println("2와 3의 공배수입니다.");
		}
		System.out.println();
		
		// 3. 범위 
		System.out.print("1~10 사이의 수를 입력하세요 : ");
		int number = scan.nextInt();
		
		if (number < 1 || number > 10) { // 안의 조건 잘 확인!! 또는인지 그리고인지!!!
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println();
		
		scan.close();
	}

}
