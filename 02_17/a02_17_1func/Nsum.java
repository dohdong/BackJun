package a02_17_1func;

public class Nsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	class Test {
	    long sum(int[] a) {
			long sum = 0;	// a �迭 ���� �� ����
	        
			for(int i = 0; i < a.length; i++) {
				sum += a[i];
			}
			return sum;
		}
	}

}
