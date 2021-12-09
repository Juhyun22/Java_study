package Testing;

public class Quiz03 {

	public static void main(String[] args) {
		// 1. 평균 구하기 
		// 반올림 잊지 말기!
		int kor = 93;
		int math = 88;
		int eng = 94;
		double avg = (kor + math + eng) / 3.0;
		
		System.out.println("국어 " + kor + "점, 수학 " + math + "점, 영어 " + eng + "점");
		System.out.println("평균: " + Math.round(avg * 100) / (double)100);
		
		// 2. 화씨 구하기
		// 소수점 사용되는지 잘 확인
		double fah; // 화씨
		double cel = 30.0; // 섭씨  
		
		fah = 9 / (double)5 * cel + 32;
		System.out.println("섭씨 " + cel +"도는 화씨 " + fah + "도 입니다.");
	}

}
