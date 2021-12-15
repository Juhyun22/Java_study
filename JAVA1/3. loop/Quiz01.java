package Testing;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 반복 출력
		// 받은 값은 변경 안되게!!!
		System.out.print("횟수를 입력하세요 : ");
		int count = scan.nextInt();
		
//		while (count > 0) { // 안에 범위 잘 확인
//			System.out.println("화이팅!!!");
//			count--;
//		}
		int i = 0;
		while (i < count) {
			System.out.println("화이팅!!!");
			i++;
		}
		System.out.println();
		
		// 2. 카운트 다운 "발사"
		System.out.print("카운트 다운 수를 입력하세요 : ");
		int countDown = scan.nextInt();
		
//		for (int i = countDown; i > -1; i--) {
//			System.out.println(i);
//			if (i == 0) {
//				System.out.println("발사");
//			}
//		}
		while (countDown >= 0) {
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("발사!!");
		System.out.println();
		
		// 3. 반복 입력
		int k = 0;
		while (k < 5) { // while 안에 들어가는 조건은 맞을때!!!! 조건 잘 보기...
			System.out.print("수를 입력하세요 : ");
			int number = scan.nextInt();
			System.out.println("출력 : " + number);
			k++;
		}
		System.out.println("끝!!");
		System.out.println();
		
		// 4. 구구단
		int j = 1;
		int num = 3;
		while (j < 10) {
			System.out.println(num + " X " + j + " = " + (num * j));
			j++;
		}
		System.out.println();
		
		scan.close();
	}

}
