package a02_16_1if;

import java.util.Scanner;

public class Dice2480 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주사위 눈을 입력하세요 :");
		int N = sc.nextInt();
		int M = sc.nextInt();
		int O = sc.nextInt();
		
		if ((M == O) & (O == N) ){
			System.out.println("상금은 "+ (10000 + (1000*M))+"원 입니다.");
		}else if((M == O) & (O != N)) {
			System.out.println("상금은 "+ (1000 + (100*M))+"원 입니다.");
		}else if((M != O) & (O == N)) {
			System.out.println("상금은 "+ (1000 + (100*O))+"원 입니다.");
		}else if((M == N) & (O != N)) {
			System.out.println("상금은 "+ (1000 + (100*M))+"원 입니다.");
		}else {
			if(M>=N & M>=O) {
				System.out.println("상금은 "+ (100*M)+"원 입니다.");
			}else if (N>=M & N>=O) {
				System.out.println("상금은 "+ (100*N)+"원 입니다.");
			}else {
				System.out.println("상금은 "+ (100*O)+"원 입니다.");
			}
		}
		
		
		
		
	}

}
