package Testing;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 평균 합격 구하기 
		System.out.print("두 점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		double avg1 = (double)(score1 + score2) / 2;
		
		if (avg1 >= 70) {
			System.out.println("합격");
		}
		System.out.println();
		
		// 2. 큰 값 구하기
		System.out.print("세 개의 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = num1;
		
		if (max < num2) {
			max = num2;
		} else {
			max = num3;
		}
		
		System.out.println(max);
		System.out.println();
		
		// 3. 과락 포함 합격 여부
		// 더 간단하게..! 
		System.out.print("점수1 : ");
		int score3 = scan.nextInt();
		System.out.print("점수2 : ");
		int score4 = scan.nextInt();
		
		double avg2 = (double)(score3 + score4) / 2;
		
//		if (avg2 >= 60) {
//			if (score3 >= 50 && score4 >= 50) {
//				System.out.println("합격");
//			} else {
//				System.out.println("과락");
//			}
//		} else {
//			System.out.println("불합격");
//		}
		if (score3 <= 50 || score4 <= 50) {
			System.out.println("과락");
		} else if (avg2 >= 60) {
			System.out.println("힙격");
		} else {
			System.out.println("불합격");
		}
		
		System.out.println();
		
//		// 4. 윤년 구하기
//		4로 나누어 떨어지는 연도는 윤년이다.
//		100으로 나누어 떨어지는 연도는 윤년이 아니다.
//		400으로 나누어 떨어지는 연도는 무조건 윤년이다.
		System.out.print("연도 : ");
		int year = scan.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년");
		}
		System.out.println();
		
		// 5. 윷놀이
		while (true) {
			System.out.print("윷 상태를 입력하세요 : ");
			int yoot1 = scan.nextInt();
			int yoot2 = scan.nextInt();
			int yoot3 = scan.nextInt();
			int yoot4 = scan.nextInt();
			
			if ((yoot1 < -1 || yoot1 > 2) || (yoot2 < -1 || yoot2 > 2)) {
				System.out.println("0과 1만 입력 가능합니다.");
				continue;
			}
			
			if ((yoot3 < -1 || yoot3 > 2) || (yoot4 < -1 || yoot4 > 2)) {
				System.out.println("0과 1만 입력 가능합니다.");
				continue;
			}
		
			int yootSum = yoot1 + yoot2 + yoot3 + yoot4;
			
			switch (yootSum) {
			case 1:
				System.out.println("도");
				break;
			case 2: 
				System.out.println("개");
				break;
			case 3:
				System.out.println("걸");
				break;
			case 4: 
				System.out.println("윷");
				break;
			default:
				System.out.println("모");
				break;
			}
			
			break;
		}
		scan.close();

	}

}
