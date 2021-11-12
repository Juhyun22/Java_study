package Memorygame;

import java.util.Scanner;

public class MemoryGameTest {

	public static void main(String[] args) {
//		게임 준비
//		＊6개의 카드가 1차원 배열에 저장된다. (3개 쌍의 과일)
//		예) ["사과", "사과", "바나나", "바나나", "수박", "수박"]
//		＊6개의 카드를 섞는다. (0번째 index와 random한 index의 배열을 교체하는 형태로 50번 섞는다.)
//
//		게임 시작
//		＊뒤집을 카드 index 두 개를 입력받는다.(0~5)
//		＊뒤집어진 카드 두 개의 번호를 출력한다.
//		예) [3]: 사과, [5]: 배
//		＊두 개의 값이 같으면 "성공"이라고 출력하고, 두 index에 ""(빈 스트링)을 채워 표시한다.
//		＊뒤집은 카드가 모두 빈칸이면 성공을 출력하지 않는다.
//		＊모두 빈 스트링이 되면 게임을 끝낸다. (flag 필드가 true가 되면 게임 끝)
		MemoryGame memoryGame = new MemoryGame();
		memoryGame.shuffle(); // 카드 섞기

		Scanner scan = new Scanner(System.in);
		while (memoryGame.getFlag() == false) {
			System.out.println("뒤집을 카드의 index 두 개를 숫자를 입력하세요.(0~5) 예) 3 5");
			System.out.print("입력 : ");
			int index1 = scan.nextInt();
			int index2 = scan.nextInt();

			if (index1 > -1 && index1 < 6 && index2 > -1 && index2 < 6) {
				memoryGame.flip(index1, index2);
			} else {
				System.out.println("0과 5사이의 수만 입력해 주세요.\n");
				continue;
			}
		}

		System.out.println("모두 맞추셨어요! 축하합니다!!!");

		scan.close();

	}
}
