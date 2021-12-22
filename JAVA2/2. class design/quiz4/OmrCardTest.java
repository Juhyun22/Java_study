package Testing;

import java.util.Scanner;

public class OmrCardTest {
	 
	public static void main(String[] args) {
		// OmrCard와 OmrCardReader 객체를 만드는 클래스 
		// OmrCard 객체에는 정답을 입력 
		// OmrCardReader 객체에서는 위에서 만든 OmrCard를 넣어 결과를 받는다.
		
		// OmrCard를 변수처럼 사용할 수 있어야 함!!! 
		Scanner scan = new Scanner(System.in);
		int[] stuAns = new int[5];
		int[] answer = {1, 2, 3, 4, 5};
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("학번 : ");
		String id = scan.next();
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "의 정답: ");
			stuAns[i] = scan.nextInt();
		}
		
		OmrCard omrCard =  new OmrCard(name, id, stuAns);
		OmrCardReader ocr = new OmrCardReader(answer);
		ocr.printAnswer(omrCard); // 이 부분!!
		
		scan.close();
	}
	
}
