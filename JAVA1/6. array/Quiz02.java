package Testing;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 배열 값 변경 
		int[] numbers = {3, 5, 2, 10, 39};
		System.out.print("변경할 index와 값을 입력하세요 : ");
		int index = scan.nextInt();
		int num = scan.nextInt();
		
		numbers[index] = num;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();		
		
		// 2. 점수 채점
		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == 'O') {
				sum += 100 / scores.length;
			}
		}
		System.out.println(sum + "점");
		
		// 3. 임금 계산
		int[] works = {3, 5, 5, 3, 5, 3, 5};
		
		int charge = 0;
//		for (int i = 0; i < works.length - 2; i++) {
//			charge += works[i] * 8500;
//		}
//		
//		for (int i = works.length - 2; i < works.length; i++) {
//			charge += works[i] * 9500;
//		}
		for (int i = 0; i < works.length; i++) {
			if (i > works.length - 2) { // 주말 
				charge += works[i] * 9500;
			} else { // 평일
				charge += works[i] * 8500;
			}
		}
		System.out.println("일주일간 총 임굼은 " + charge + "원");
		
		// 4. 배열 값 변경
		// index 확인 
		int[] even = new int[5];
		int idx = 0;
		
		while(idx < 5) { // index로 루프 지정..!  
			System.out.print("수를 입력하세요 : ");
			int number = scan.nextInt();
			
			if (number % 2 == 0) {
				even[idx] = number;
				idx++;
				// System.out.print(index);
			}
			
		}
		
		for (int i = 0; i < even.length; i++) {
			System.out.print(even[i] + " ");
		}
		
		scan.close();
	}

}
