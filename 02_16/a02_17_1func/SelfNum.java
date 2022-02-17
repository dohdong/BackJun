package a02_17_1func;

public class SelfNum {

	public static void main(String[] args) {
		
		boolean[] check = new boolean[101];
		 
		for (int i = 1; i < 101; i++){
			int n = self(i);
		
			if(n < 101){	
				check[n] = true;
			}
		}
 

		for (int i = 1; i < 101; i++) {
			if (!check[i]) {	
				System.out.println(i);
			}
		}

	}
 
 
 
	public static int self(int number){
		int sum = number;
    
		while(number != 0){  //자리 마다 구할때 아래와 같이 하더라
			sum = sum + (number % 10); // 첫 째 자리수
			number = number/10;	// 10을 나누어 첫 째 자리를 없앤다
		}
    
		return sum;
	}
}    