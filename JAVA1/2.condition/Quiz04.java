package Testing;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 계절 구하기
		// case 있는 곳에서부터 밑에 전체 수행됨 -> break 필수!!
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("월을 입력해주세요");
		}
		System.out.println();
		
		scan.close();
	}

}
