package a02_14;

import java.util.Scanner;

public class BlackJack2798 {
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		System.out.print("��� ���ڸ� �Է��Ͻðڽ��ϱ�? ");
		int N = in.nextInt();
		System.out.print("���� ���� ������ ���� �Ͻðڽ��ϱ�? ");
		int M = in.nextInt();
 
		int[] arr = new int[N];

		System.out.print(N+"���� ���ڸ� �پ��ϰ� �����ּ���");
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		int resultNum = search(arr, N, M);
		
		
		System.out.println(resultNum);
	}
 
	
	// Ž��
	static int search(int[] arr, int N, int M) {
		int result = 0;
 
		// 3���� ���� ������ ù��° ī��� N - 2 ������ ��ȸ
		for (int i = 0; i < N - 2; i++) {
 
			// �� ��° ī��� ù ��° ī�� �������� N - 1 ������ ��ȸ
			for (int j = i + 1; j < N - 1; j++) {
 
				// �� ��° ī��� �� ��° ī�� �������� N ���� ��ȸ
				for (int k = j + 1; k < N; k++) {
					
					// 3�� ī���� �� ���� sumAll
					int sumAll = arr[i] + arr[j] + arr[k];
					
					// M�� �� ī���� ���� ���ٸ� sumAll return �� ���� 
					if (M == sumAll) {	
						return sumAll;
					}
					
					// �� ī���� ���� ���� �պ��� ũ�鼭 M ���� ���� ��� result ���� 
					if(result < sumAll && sumAll < M) {
						result = sumAll;
					}
				}
			}
		}
		
		// ��� ��ȸ�� ��ġ�� result ���� 
		return result;
	}
}