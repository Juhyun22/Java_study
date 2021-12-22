package Testing;

public class OmrCardReader {
	// 정답 5개 입력받아 정답 배열에 저장
	// OmrCard하나를 입력받아서 이름, 학번, 점수를 출력
	private int[] answer = new int[5];
	
	public OmrCardReader(int[] answer) {
		this.answer = answer;
	}
	
	public void printAnswer(OmrCard omrCard) { // OmrCard를 변수처럼 사용!! 
		System.out.println("이름: " + omrCard.setName());
		System.out.println("학번: " + omrCard.setId());
		
		int score = 0;
		int[] stuAns = omrCard.setStuAns();
		for (int i = 0; i < answer.length; i++) {
			if (stuAns[i] == answer[i]) {
				score += 100 / answer.length;
			}
		}
		System.out.println("점수: " + score);
		
	}
	
	
}
