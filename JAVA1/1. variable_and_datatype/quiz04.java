package Testing;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캔받는 코드 잘기억하기!! new!!!!
		// 1. 몫과 나머지
		System.out.print("입력1: ");
		int num1 = scan.nextInt();
		System.out.print("입력2: ");
		int num2 = scan.nextInt();
		
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.println("몫 : " + quotient + " 나머지 : " + remainder);
		System.out.println();
		
		// 2. 교체(swap 알고리즘)
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("y : ");
		int y = scan.nextInt();
		
		int temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x는 " + x + "이고, y는 " + y + "입니다.");
		System.out.println();
		
		// 3. 초 변환
		System.out.print("초 : ");
		int sec = scan.nextInt();
		
		int min = sec / 60;
		int ressec = sec % 60;
		
		System.out.println(min + "분 " + ressec + "초");
		System.out.println();
		
		// 4. 자리수 쪼개기
		// java에서 지수는 Math.pow(수, 지수). double로 나오니 형 변환 하고싶으면 하기
		System.out.print("입력 : ");
		int number = scan.nextInt();
		
		int storeNum = 0;
		for (int i = 3; i > -1; i--) {
			// 1000 100 10 1
			storeNum = number / (int)Math.pow(10, i);
			number = number % (int)Math.pow(10, i);
			System.out.println(storeNum);
		}
		System.out.println();
		
		// 5. 자리수 합 구하기
		System.out.print("입력 : ");
		int number1 = scan.nextInt();
		
		int sum = 0;
		int changedNum = number1;
		for (int i = 3; i > -1; i--) {
			sum += changedNum / (int)Math.pow(10, i);
			changedNum = changedNum % (int)Math.pow(10, i);
		}
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println();
		
		scan.close();
	}


}
