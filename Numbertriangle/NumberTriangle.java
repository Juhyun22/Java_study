package Numbertriangle;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
//		2. 숫자 삼각형 출력하기
		Scanner scan = new Scanner(System.in);
		int temp = 0;  // 숫자 저장할 곳. 
		
		while (true) {
			System.out.print("숫자 삼각형의 크기를 입력하세요 : ");
			int n = scan.nextInt();
			
			if (n >= 3 && n <= 99) {
				for (int i = 0; i < n; i++) {
					for (int j = 0; j <= i; j++) {
						if (j == 0) {
							System.out.print((i + 1) +"  ");
							temp = i + 1;
						} else {
							temp = temp + n - j;
							System.out.print(temp + "  ");
						}
					}
					System.out.println();
				}
				break;
			} else {
				System.out.println("3이상 99이하의 정수를 입력해주세요.\n");
				continue;
			}
		}
		
		
		scan.close();
	}

}
