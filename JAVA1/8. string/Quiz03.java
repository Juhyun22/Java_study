package Testing;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 문자열 입력 
		System.out.print("ID를 입력 하세요 : ");
		// String id = scan.next();
		String id = scan.nextLine(); // 좀 더 안정적임 
		
		System.out.println("Welcome! " + id);
		System.out.println();
		
		// 2. 문자열 검색 
		System.out.print("단어를 입력하세요 : ");
		String word = scan.nextLine();
		
//		String[] words = word.split("");
//		int count = 0;
//		for (int i = 0; i < words.length; i++) {
//			if (words[i].contains("e")) {
//				count++;
//			}
//		}
		// charAt 사용!!
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println("e의 개수는 " + count + "개 입니다.");
		System.out.println();
		
		
		scan.close();
	}

}
