package a02_16_4array;

import java.util.Scanner;

public class UpAve4344 {

	public static void main(String[] args) {
		int[] score;
		int j = 0;
		Scanner sc = new Scanner(System.in);
		//System.out.print("��� �׽�Ʈ �ϳ���?");
		int N = sc.nextInt();
		
		
		for ( int i = 0 ; i < N ; i++) {
			double sum = 0;
			//System.out.print(i+1+"��° ���̽��� �л�����?");
			int M = sc.nextInt();
			score = new int[M];
			//System.out.println("�л�����");
			for (j = 0; j < M ; j++) {
				
				int S = sc.nextInt();
				score[j] = S;
				sum += S;
				
			}
			
			double mean = (sum/M);
			double count = 0;
			
			for (j = 0; j < M ; j++) {
				if(score[j]>mean) {
					count++;
				}
				
			}

			System.out.println(100*count/M);
			
			
		}
	}
}
		