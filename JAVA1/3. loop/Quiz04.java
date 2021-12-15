package Testing;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 합 구하기
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println();
		
		// 2. 팩토리얼
		System.out.print("수를 입력하세요 : ");
		int fac = scan.nextInt();
		
		int facAns = 1;
		if (fac > 0 || fac < 11) {
			for (int i = 2; i <= fac; i++) {
				facAns *= i;
			}
		}
		System.out.println(facAns);
		
		// 3. 약수 구하기
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		
		scan.close();
	}

}
