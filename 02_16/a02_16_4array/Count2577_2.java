package a02_16_4array;

import java.util.Scanner;

public class Count2577_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 3개 입력하세요 ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int O = sc.nextInt();
		
		int P = N*M*O;
		
		int[] counts = new int[10];
		while (P>0) {
			counts[P%10]++;
			P /=10;
		}
		
		for (int i = 0 ; i<counts.length; i++) {
			System.out.println(counts[i]);
		}
		
		
		
		
	}

}
