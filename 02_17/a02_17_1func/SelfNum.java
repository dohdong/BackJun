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
    
		while(number != 0){  //�ڸ� ���� ���Ҷ� �Ʒ��� ���� �ϴ���
			sum = sum + (number % 10); // ù ° �ڸ���
			number = number/10;	// 10�� ������ ù ° �ڸ��� ���ش�
		}
    
		return sum;
	}
}    