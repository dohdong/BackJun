package a02_17_1func;

import java.util.Scanner;

public class HanNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(Han(sc.nextInt()));
		sc.close();
 
		
	}
 
	public static int Han(int num) {
		int cnt = 0;
 
		if (num < 100) {
			return num;
		}
 
		else {
			cnt = 99;
			if (num == 1000) { // 예외처리 
				num = 999;
			}
 
			for (int i = 100; i <= num; i++) {
				int A = i / 100; 
				int B = (i / 10) % 10; 
				int C = i % 10;
 
				if ((A - B) == (B - C)) { //등차수열
					cnt++;
				}
			}
		}
 
		return cnt;
	}
 
}