package a02_16_1if;

import java.util.Scanner;

public class Alarm2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간을 입력하세요 :");
		int N = sc.nextInt();
		System.out.print("분을 입력하세요 : ");
		int M = sc.nextInt();
		
		if (M-45 < 0) {
			if (N-1<0) {
				System.out.println((N+23)+" "+(M+15));
			}else {
				System.out.println(N-1+" "+(M+15));
			}
			
		}else {
			System.out.println(N+" "+(M+45));
		}
		
		
		
	}

}
