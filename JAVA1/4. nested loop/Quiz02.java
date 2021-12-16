package Testing;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 모래시계 출력하기
		while(true) {
			System.out.print("모래시계 크기를 입력하세요(홀수만) : ");
			int row = scan.nextInt();
			
			if (row < 2 || row > 100) {
				System.out.println("3이상 99미만의 수를 입력하세요.");
				continue;
			} else if (row % 2 == 0) {
				System.out.println("3이상 99미만의 홀수를 입력하세요.");
				continue;
			} else {
				// (1) 행을 반으로 나눠서 구성한다. (위, 아래)
				// (2) 열을 구성하는 요소를 분리한다.
				// (2)-1. - 를 출력하는 규칙을 찾는다. => 삼각형
				// (2)-2. *+ 를 출력하는 규칙을 찾는다. => row / 2 몫에서부터 행마다 하나씩 감소 
				// (2)-3. * 를 출력하는 규칙을 찾는다. => 무조건 출력 
				// (2)-4. - 를 출력하는 규칙을 찾는다. => 삼각형 (2)-1과 같다!!
				for (int i = 0; i <= row / 2; i++) {
					// (2)-1. - 출력 
					for (int j = 0; j < i; j++) {
						System.out.print("-");
					}
					
					// (2)-2. *+ 출력
					for (int j = 0; j < (row / 2) - i; j++) {
						System.out.print("*+");
					}
					
					// (2)-3. * 출력
					System.out.print("*");
					
					// (2)-4. - 출력
					for (int j = 0; j < i; j++) {
						System.out.print("-");
					}
					
					System.out.println();
				}
				
				// (3) 반으로 나눈 나머지 행
				for (int i = row / 2; i > 0; i--) { // 가운데 행 미포함
					// (3)-1. - 출력
					for (int j = i - 1; j > 0; j--) {
						System.out.print("-");
					}
					
					// (3)-2. *+ 출력
					for (int j = 0; j <= (row / 2) - i; j++) {
						System.out.print("*+");
					}
					
					// (3)-3. * 출력
					System.out.print("*");
					
					// (3)-4. - 출력
					for (int j = i - 1; j > 0; j--) {
						System.out.print("-");
					}
					
					System.out.println();
				}
			} 
			break;
		}
		System.out.println();
		
		// 2. 숫자 삼각형
		System.out.print("숫자 삼각형의 크기를 입력하세요 : ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			int temp = i;
			for (int j = 0; j < i; j++) {
				System.out.print(temp + " ");
				temp = temp + (num - 1 - j);
			}
			System.out.println();
		}
		
		scan.close();
	}

}
