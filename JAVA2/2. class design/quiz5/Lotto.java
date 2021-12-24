package Testing;

import java.util.Random;

public class Lotto {
	// 수동, 자동으로 숫자 받아야 함
	// 자동은 rand 함수 이용 
	private int[] numbers = new int[6];
	
	public int[] getNumbers() {
		return this.numbers;
	}
	
	public void manual(int num1, int num2, int num3, int num4, int num5, int num6) {
		numbers[0] = num1;
		numbers[1] = num1;
		numbers[2] = num1;
		numbers[3] = num1;
		numbers[4] = num1;
		numbers[5] = num1;
	}
	
	public void auto() {
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			int randNum = rand.nextInt(45) + 1; // 1 ~ 45
			
			// 중복 확인 필수 !!!!
			boolean isDuplicate = false;
			for (int j = 0; j < numbers.length; j++) {
				if (this.numbers[j] == randNum) {
					i--; // 한번 더 돌리기 위해!!!! 중요!!!
					isDuplicate = true;
					break;
				}
			}
			
			if (isDuplicate == false) {
				numbers[i] = randNum;
			}
		}
	}
	
	public void printNumbers() {
		for (int i = 0; i < this.numbers.length; i++) {
			System.out.print(this.numbers[i] + " ");
		}
	}
	
}