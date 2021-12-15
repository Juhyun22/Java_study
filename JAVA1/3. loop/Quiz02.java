package Testing;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 반복 출력
		for (int i = 35; i < 41; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2. 카운트 다운 출력
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 3. 특정 조건 구하기
		// 생각 좀만 해보자!!! 
//		for (int i = 1; i <= 50; i++) {
//			if (i % 3 == 0) {
//				System.out.print(i + " ");
//			}
//		}
		for (int i = 1; i <= 50; i +=3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 4. 갯수 세기
		int count = 0;
//		for (int i = 1; i <= 100; i++) {
//			if (i % 7 == 0) {
//				count++;
//			}
//		}
		for (int i = 0; i <= 100; i += 7) {
			count++;
		}
		System.out.println("7의 배수의 갯수는 : " + count);
		
		// 5. 구구단
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		System.out.println();
		scan.close();
		
	}

}
