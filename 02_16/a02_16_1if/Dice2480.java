package a02_16_1if;

import java.util.Scanner;

public class Dice2480 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֻ��� ���� �Է��ϼ��� :");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int O = sc.nextInt();
		
		if ((M == O) & (O == N) ){
			System.out.println("����� "+ (10000 + (1000*M))+"�� �Դϴ�.");
		}else if((M == O) & (O != N)) {
			System.out.println("����� "+ (1000 + (100*M))+"�� �Դϴ�.");
		}else if((M != O) & (O == N)) {
			System.out.println("����� "+ (1000 + (100*O))+"�� �Դϴ�.");
		}else if((M == N) & (O != N)) {
			System.out.println("����� "+ (1000 + (100*M))+"�� �Դϴ�.");
		}else {
			if(M>=N & M>=O) {
				System.out.println("����� "+ (100*M)+"�� �Դϴ�.");
			}else if (N>=M & N>=O) {
				System.out.println("����� "+ (100*N)+"�� �Դϴ�.");
			}else {
				System.out.println("����� "+ (100*O)+"�� �Դϴ�.");
			}
		}
		
		
		
		
	}

}
