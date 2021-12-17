package Testing;

import java.util.Random;
import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 위치 변경 (swap)
		int[] numbers = {3, 5, 2, 10, 39};
		
		System.out.print("두개의 index를 입력하세요 : ");
		int index1 = scan.nextInt();
		int index2 = scan.nextInt();
		
		int temp = numbers[index1];
		numbers[index1] = numbers[index2];
		numbers[index2] = temp;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 2. 배열 순서 변경 
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Random rand = new Random();
		for (int i = 0; i < 100; i++) {
			int randIndex = rand.nextInt(10); // 0 ~ 9
			
			int swap = num[0];
			num[0] = num[randIndex];
			num[randIndex] = swap;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		// 3. 빈도수 구하기 
		// 결과값이 뭐니ㅋㅋ
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
//		int[] storeNum = new int[5];
//		
//		for (int i = 0; i < numbers3.length; i++) {
//			switch (numbers3[i]) {
//			case 1: 
//				storeNum[0]++;
//				break;
//			case 2:
//				storeNum[1]++;
//				break;
//			case 3:
//				storeNum[2]++;
//				break;
//			case 4:
//				storeNum[3]++;
//				break;
//			case 5:
//				storeNum[4]++;
//				break;
//			default:
//				break;
//			}
//		}
//		
//		for (int i = 0; i < storeNum.length; i++) {
//			System.out.println(i + " : " + storeNum[i] + "개");
//		}
		
		int [] freq = new int[6]; // 0의 인덱스는 버린다. 1, 2, 3, 4, 5 => 각 빈도수 저장
		
		for (int i = 0; i < numbers3.length; i++) {
			freq[numbers3[i]]++;
		}
		
		for (int i = 1; i < freq.length; i++) {
			System.out.println(i + " : " + freq[i]);
		}
		
		scan.close();
		
	}

}
