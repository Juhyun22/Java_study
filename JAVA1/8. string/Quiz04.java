package Testing;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 1. 문자열 검색 
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		
		int count = 0;
		for (int i = 0; i < files.length; i++) {
			if (files[i].endsWith(".jpg")) {
				count++;
			}
		}
		System.out.println("jpg 파일 개수 : " + count);
		System.out.println();
		
		// 2. 영 단어 퀴즈 
		Scanner scan = new Scanner(System.in);
		String[] answer = {"victory", "love", "computer", "notebook"};
		int score = 0;
		
//		String[] ans = new String[4];
//		System.out.print("1. 승리를 영어로 입력하세요 : ");
//		ans[0] = scan.nextLine();
//		System.out.print("2. 사랑을 영어로 입력하세요 : ");
//		ans[1] = scan.nextLine();
//		System.out.print("3. 컴퓨터를 영어로 입력하세요 : ");
//		ans[2] = scan.nextLine();
//		System.out.print("4. 노트북을 영어로 입력하세요 : ");
//		ans[3] = scan.nextLine();
//		
//		for (int i = 0; i < answer.length; i++) {
//			if (ans[i].equals(answer[i])) {
//				score += 100 / answer.length;
//			}
//		}
//		System.out.println("점수는 " + score + "점 입니다.");
//		System.out.println();
		
		String[] quizWord = {"승리", "사랑", "컴퓨터", "노트북"};
		for (int i = 0; i < quizWord.length; i++) {
			System.out.print((i + 1)+ "번 " + quizWord[i] + "를 영어로 입력하세요 : ");
			String ans = scan.next();
			if (ans.equals(answer[i])) {
				score += 25;
			}
		}
		System.out.println("점수 : " + score);
		scan.close();
		
		// 3. 동명이인 수 구하기 
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] member = memberStr.split(":");
		// 동명이인에서 같은 이름 (이름이 2번 이상 반복)에 대한 코드 작성 못함.. ㅠ
//		String[] countMem = new String[10];
//		int result = 0;
//		
//		for (int i = 0; i < member.length; i++) {
//			countMem[i] = member[i];
//			for (int j = 0; j < i; j++) {
//				if (countMem[i].equals(member[j])) {
//					countMem[i] = member[i];
//					result += 1;
//					System.out.print(countMem[i] + " ");
//				}
//				
//			}
//		}
//		System.out.println();
//		System.out.println("동명이인 종류 수: " + result);
		int sameCount = 0;
		
		for (int i = 0; i < member.length; i++) {
			String name = member[i]; // 검사할 기준 이름 
			boolean isSame = false;  // 동명이인의 이름이 존재하는가? 
			
			if (name.equals("")) { // 동명이인으로 체크되거 빈칸인 경우 skip -> 위로 올라가서 i++
				continue;  // 위로 올라가 
			}
			
			for (int j = i + 1; j < member.length; j++) {
				if (name.equals(member[j])) {  // 저장한 name과 member[j]가 같으면,
					isSame = true; // 동명이인이 있다! 
					member[j] = ""; // 동명이인이 있는 배열은 다 빈칸으로 만들자! 
				}
			}
			
			if (isSame) {
				sameCount++;
			}
		}
		
		for (int i = 0; i < member.length; i++) {
			System.out.print(member[i] + "/ ");
		}
		System.out.println();
		System.out.println("동명이인 종류 수 : " + sameCount);
		
	}

}
