package a02_16_2for;

import java.util.Scanner;

public class LessX10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 몇개를 입력할까요? ");
		int N = sc.nextInt();
		System.out.print("몇보다 작은 수를 원하나요?");
		int M = sc.nextInt();
		int arr[] = new int[N];
		
		for (int i = 0; i < N ; i++) {
			int O = sc.nextInt();
			arr[i] = O;
		}
		
		for (int i = 0; i<N; i++) {
			if(arr[i] < M) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		
	}

}
