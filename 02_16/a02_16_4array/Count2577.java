package a02_16_4array;

import java.util.Scanner;

// ��.. ���� ���� �ʳ�.... �ϴ� for �� �ι����� �� ������ �־��µ�
// str.charAt(j)-'0' �� �ƿ� ������ ���߳�.. ���� �� �� ������. ��...

public class Count2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� 3�� �Է��ϼ��� ");
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
