package a02_16_1if;

import java.util.Scanner;

public class Oven2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ð��� �Է��ϼ��� :");
		int N = sc.nextInt();
		System.out.print("���� �Է��ϼ��� : ");
		int M = sc.nextInt();
		
		System.out.print("�ʿ��� �ð��� �Է��ϼ��� : ");
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
			System.out.println("�����ð��� �ʹ� ��� ");
		}
		
		
		
		
	}

}
