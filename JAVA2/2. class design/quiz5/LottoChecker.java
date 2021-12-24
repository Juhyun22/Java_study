package Testing;

import java.util.Random;

public class LottoChecker {
	private int[] lottoNum = new int[6];
	
	public LottoChecker() { // 선언 되자마자 수 넣기 !
		Random rand = new Random();
		for (int i = 0; i < lottoNum.length; i++) {
			// 중복 확인 필수 !!! 
			int randNum = rand.nextInt(45) + 1;
			boolean isDuplicate = false;
			
			for (int j = 0; j < lottoNum.length; j++) {
				if (lottoNum[j] == randNum) {
					i--;
					isDuplicate = true;
					break;
				}
			}
			
			if (isDuplicate == false) {
				lottoNum[i] = randNum;
			}
			
		}
	}
	
	public String check(Lotto lotto) {
		int[] numbers = lotto.getNumbers();
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == lottoNum[i]) {
				count += 1;
			}
		}
		
		switch (count) {
		case 6: 
			return "1등";
		case 5:
			return "2등";
		case 4:
			return "3등";
		case 3:
			return "4등";
		default: 
			return "꽝";
		}
	}
}





