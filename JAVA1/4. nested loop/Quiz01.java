package Testing;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 주사위 문제
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2. 구구단
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		System.out.println();
		
		// 3. 별찍기
		// 어떻게 찍힐지 잘 생각해보기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" );
			}
			System.out.println();
		}
		System.out.println();
		
		// 4. 거꾸로 된 삼각형
		// 어떻게 찍힐지 잘 생각!!
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// 5. 피라미드
		// for문 안의 변수들 관계 파악!!
//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j > i; j--) {
//				System.out.print(" ");
//			}
//			
//			for (int k = 0; k < (i * 2 + 1); k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		System.out.println();
		for (int i = 1; i <=5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
