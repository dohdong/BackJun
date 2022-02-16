package a02_14;

import java.util.Scanner;

public class BlackJack2798 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		System.out.print("몇개의 숫자를 입력하시겠습니까? ");
		int N = in.nextInt();
		System.out.print("숫자 합은 몇으로 제한 하시겠습니까? ");
		int M = in.nextInt();
 
		int[] arr = new int[N];

		System.out.print(N+"개의 숫자를 다양하게 적어주세요");
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		int resultNum = search(arr, N, M);
		
		
		System.out.println(resultNum);
	}
 
	
	// 탐색
	static int search(int[] arr, int N, int M) {
		int result = 0;
 
		// 3개를 고르기 때문에 첫번째 카드는 N - 2 까지만 순회
		for (int i = 0; i < N - 2; i++) {
 
			// 두 번째 카드는 첫 번째 카드 다음부터 N - 1 까지만 순회
			for (int j = i + 1; j < N - 1; j++) {
 
				// 세 번째 카드는 두 번째 카드 다음부터 N 까지 순회
				for (int k = j + 1; k < N; k++) {
					
					// 3개 카드의 합 변수 sumAll
					int sumAll = arr[i] + arr[j] + arr[k];
					
					// M과 세 카드의 합이 같다면 sumAll return 및 종료 
					if (M == sumAll) {	
						return sumAll;
					}
					
					// 세 카드의 합이 이전 합보다 크면서 M 보다 작을 경우 result 갱신 
					if(result < sumAll && sumAll < M) {
						result = sumAll;
					}
				}
			}
		}
		
		// 모든 순회를 마치면 result 리턴 
		return result;
	}
}