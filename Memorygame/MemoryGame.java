package Memorygame;

import java.util.Random;

public class MemoryGame {
	// 게임 준비
	// 카드 세팅
	private String[] fruitCard = { "사과", "사과", "바나나", "바나나", "수박", "수박" };
	// private String[] cards = new String[6];

	// 카드 섞기
	public void shuffle() {
		Random rand = new Random();

		String temp;
		for (int i = 0; i < 50; i++) {
			int randNum = rand.nextInt(6);
			temp = fruitCard[0];
			fruitCard[0] = fruitCard[randNum];
			fruitCard[randNum] = temp;
		}

//		System.out.println("잘 섞였는지 확인");
//		for(int i = 0; i < fruitCard.length; i++) {
//			System.out.print(fruitCard[i] + " ");
//		}
//		System.out.println();
	}

	// 게임 시작
	// 뒤집은 카드가 다 맞는지 확인
	public boolean getFlag() {
		for (int i = 0; i < this.fruitCard.length; i++) {
			if (fruitCard[i].equals(" ")) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	// 뒤집은 카드 확인
	public void flip(int index1, int index2) {
		if (fruitCard[index1].equals(" ") || fruitCard[index2].equals(" ")) {
			System.out.println("이미 뒤집었습니다. 다른 번호를 선택해주새요.");
			System.out.println("[" + index1 + "]" + fruitCard[index1] + ", " + "[" + index2 + "]" + fruitCard[index2] + "\n");
		} else {
			System.out.println("[" + index1 + "]" + fruitCard[index1] + ", " + "[" + index2 + "]" + fruitCard[index2]);

			if (fruitCard[index1].equals(fruitCard[index2])) {
				System.out.println("성공!!\n");
				fruitCard[index1] = " ";
				fruitCard[index2] = " ";
			} else {
				System.out.println("실패!\n");
			}
		}

	}

}
