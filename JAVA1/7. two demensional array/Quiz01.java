package Testing;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			    };
		
		// 1. 학생별 평균 구하기 
		// 값이 어떤 형태인지 보기
		for (int i = 0; i < scores.length; i++) {
			double avg = 0;
			for (int j = 0; j < scores[i].length; j++) {
				avg += (double)scores[i][j] / scores[i].length;
			}
			System.out.println((i + 1) + "번째 학생의 평균은 " + Math.round(avg * 10)/10.0);
		}
		System.out.println();
		
		// 2. 학생별 최고점 구하기 
		for (int i = 0; i < scores.length; i++) {
			int maxScore = 0;
			for (int j = 0; j < scores[i].length; j++) {
				maxScore = scores[i][j] > maxScore? scores[i][j] : maxScore;
			}
			System.out.println((i + 1) + "번째 학생의 최고점은 " + maxScore);
		}
		System.out.println();
		
		// 3. 평균 최고점 구하기
		// type 변수형 변하는지 아닌지 확인!!
		int highStu = 0;
		double highSco = 0;
		for (int i = 0; i < scores.length; i++) {
			double avg = 0;
			for (int j = 0; j < scores[i].length; j++) {
				avg += (double)scores[i][j] / scores[i].length;
			}
			
			if (avg > highSco) {
				highSco = avg;
				highStu = i + 1;
			}
			
		}
		System.out.println("평균이 가장 높은 학생은 " + highStu + "번째 학생이고, 평균 점수는 " + Math.round(highSco * 10)/10.0);;
		System.out.println();
		
		// 4. 특정 과목 최고점 
		int speSubject = 4;
		int speIndex = speSubject - 1;
		int speStudent = 0;
		int speNumber = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i][speIndex] > speNumber) {
				speStudent = i + 1;
				speNumber = scores[i][speIndex];
			}
		}
		System.out.println(speSubject + "번째 과목의 최고 성적자는 " + speStudent + "번째 학생이고, "
				+ "점수는 " + speNumber);
		System.out.println();
		
		// 5. 일부 평균 최고점 
		int minIndex = 3;
		int maxIndex = 7;
		int maxStudent = 0;
		int maxSum = 0;
		double maxAvg = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = minIndex; j <= maxIndex; j++) {
				sum += scores[i][j];
			}
			
			if (sum > maxSum) {
				maxStudent = i + 1;
				maxSum = sum;
				maxAvg = sum / 5.0;
			}
		}
		System.out.println(minIndex + "~" + maxIndex + "과목 평균이 가장 높은 학생은 " + 
		maxStudent + "번째 학생이고, 평균은" + maxAvg + "입니다.");
		
		
	}
}
