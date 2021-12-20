package Testing;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 10 입력하기 
		int[][] arr1 = new int[2][3];
		
		for(int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = 10;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 2. 순서대로 입력하기 
		int[][] arr2 = new int[3][4];
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = j + 1;
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 3. 배열 별로 입력하기
		int[][] arr3 = new int[3][3];
		
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = i + 1;
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 4. 십자(+) 그리기
		int[][] arr4 = new int[5][5];
		
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				if ((arr4.length / 2) == i || (arr4[i].length / 2) == j) {
					arr4[i][j] = 1;
				} else {
					arr4[i][j] = 0;
				}
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// 5. 전체 수 입력 1
		int[][] arr5 = new int[3][3];
//		int num = 1;
//		
//		for (int i = 0; i < arr5.length; i++) {
//			for (int j = 0; j < arr5[i].length; j++) {
//				arr5[i][j] = num++;
//				System.out.print(arr5[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = (i * 3) + (j + 1);
			}
		}
		printArray(arr5);
		
		// 6. 전체 수 입력 2
		int[][] arr6 = new int[3][3];
		
//		for (int i = 0; i < arr6.length; i++) {
//			int number = i + 1;
//			for (int j = 0; j < arr6[i].length; j++) {
//				 arr6[i][j] = number;
//				 number += arr6.length;
//				 System.out.print(arr6[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
//	}
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				arr6[i][j] = (i + 1) + (j * 3);
			}
		}
		printArray(arr6);
	}
	
	// teacher
	public static void printArray(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
