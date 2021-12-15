package Testing;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 무한 입력
		while (true) {
			System.out.print("수를 입력하세요 : ");
			int num = scan.nextInt();
			if (num == 0) {
				System.out.println("끝");
				break;
			}
		}
		
		// 2. 배수의 합 구하기
		int sum = 0;
		for (int i = 3; i <= 50; i+= 3) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
		
	}

}
