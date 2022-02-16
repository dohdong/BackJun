package a02_16_1if;

import java.util.Scanner;

public class Oven2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력하세요 :");
		int N = sc.nextInt();
		System.out.print("분을 입력하세요 : ");
		int M = sc.nextInt();
		
		System.out.print("필요한 시간을 입력하세요 : ");
		int O = sc.nextInt();
		
		if ( (M+O) < 60 ) {
			System.out.println(N+" "+(M+O));
		}else if(60<=(M+O)&(M+O)<120) {
			if((N+1)>=24) {
				System.out.println("0 "+(M+O-60));
			}else {
				System.out.println((N+1)+" "+(M+O-60));
			}
		}else if(120<=(M+O)&(M+O)<180) {
			if((N+2)>=24) {
				System.out.println((N-22)+" "+(M+O-120));
			}else {
				System.out.println((N+2)+" "+(M+O-120));
			}
			
		}else {
			System.out.println("조리시간이 너무 길다 ");
		}
		
		
		
		
	}

}
