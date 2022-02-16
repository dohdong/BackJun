package a02_16_4array;

import java.util.Scanner;

public class Average1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		double avg = 0;
		
		System.out.print("시험을 몇 과목 보았나요? ");
		int N = sc.nextInt();
		
		int[] score = new int[N];
		
		System.out.println("성적은? ");
		for (int i = 0 ; i < N ; i++) {
			score[i] = sc.nextInt();
		}
		
		for (int j = 0; j<N ; j++) {
			if(score[j] > max) {
				max = score[j];
			}
		}
		System.out.println(max);
		
		for (int k = 0; k < N ; k++) {
			avg += 100.0*score[k]/max/N;
		}

		
		System.out.printf("%.2f",avg);
		
		
		
	}

}
