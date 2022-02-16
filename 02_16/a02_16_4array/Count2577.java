package a02_16_4array;

import java.util.Scanner;

// 흠.. 역시 쉽지 않네.... 일단 for 문 두번으로 할 생각은 있었는데
// str.charAt(j)-'0' 은 아예 생각도 못했네.. 배우긴 한 것 같은데. 흠...

public class Count2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 3개 입력하세요 ");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int O = sc.nextInt();
		
		int P = N*M*O;
		
		String str = Integer.toString(P);
		
		for(int i = 0; i < 10 ; i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (( str.charAt(j) - '0') == i) {
					count++;
				}
			}
			
			System.out.println(count);
		}

	}

}
