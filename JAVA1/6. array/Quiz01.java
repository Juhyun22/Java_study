package Testing;

public class Quiz01 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. 배열 값 접근 
		numbers[3] = 6;
		
		// 2. 배열 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 3. 배열 역순 출력 
		for (int i = numbers.length - 1; i > -1; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 4. 배열 짝수번 출력
		// 모든 배열을 다 돌리는게 좋음
//		for (int i = 1; i < numbers.length; i += 2) {
//			System.out.print(numbers[i] + " ");
//		}
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
		// 5. index
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어 있는 index는 " + i);
			}
		}
		
		// 6. 최대값
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			max = max < numbers[i]? numbers[i] : max;
		}
		System.out.println("가장 큰 값은 " + max);
		
		// 7. 최소값 index
		// 저장할 값 잘 보기!!! 
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
				minIndex = i;
			}
		}
		System.out.println("최소값의 인덱스는 " + minIndex);
		
		// 8. 평균
		double avg = 0;
		for (int i = 0; i < numbers.length; i++) {
			avg += (double)numbers[i] / numbers.length;
		}
		System.out.println("평균은 " + avg);
	}
}
