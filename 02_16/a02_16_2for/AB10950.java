package a02_16_2for;

import java.util.Scanner;

public class AB10950 {

	public static void main(String[] args) {
		System.out.print("숫자 몇개를 입력할까요? ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		
		int arr[] = new int[N];
		for(int i = 0 ; i < N ; i++ ) {
			int o = sc.nextInt();
			int p = sc.nextInt();
			//System.out.println(o+p);
			arr[i] = o+p;
		}
		
		for (int k : arr) {
			System.out.println(k);
		}
		
		
	}

}
