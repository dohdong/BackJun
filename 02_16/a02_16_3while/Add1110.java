package a02_16_3while;


//while.. 쉽지 않네...

import java.util.Scanner;

public class Add1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력하세요 : ");
		int N = sc.nextInt();
		int copy = N;
		
		int count = 0;
		
		while (true) {
			N = ((N%10)*10) + (((N/10)+(N%10))%10);
			count++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(count);
		
		
		
	}

}
