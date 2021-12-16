package Testing;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 합 구하기
		System.out.print("수를 입력하세요 : ");
		int number = scan.nextInt();
		
		System.out.println(getSum(number));
		System.out.println();
		
		// 2. 최소값 
		System.out.print("5개의 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		
		minNumber(num1, num2, num3, num4, num5);
		System.out.println();
		
		// 3. 소수(prime) 판별
		while (true) {
			System.out.print("수를 입력하세요 : ");
			int num = scan.nextInt();
			
			if (num <= 1) {
				System.out.println("2 이상의 수를 입력하세요.");
				continue;
			}
			
			System.out.println(isPrime(num));
			break;
		}
			
	}
	
	// 1. 합 구하기 
	public static int getSum(int number) {
		int sum = 0;
		for (int i = 1; i <=number; i++) {
			if (sum > 100) {
				return sum;
			}
			sum += i;
		}
		return sum;
	}
	
	// 2. 최소값
	public static void minNumber(int num1, int num2, int num3, int num4, int num5) {
		int min = num1;
		min = min > num2? num2 : min;
		min = min > num3? num3 : min;
		min = min > num4? num4 : min;
		min = min > num5? num5 : min;
		System.out.println("최소값은 " + min);
	}
	
	// 3. 소수(prime) 판별법 
	public static boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
