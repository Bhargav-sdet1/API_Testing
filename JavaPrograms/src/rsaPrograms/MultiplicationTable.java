package rsaPrograms;

public class MultiplicationTable {
	
	
	public static void main(String[] args) {
		int total=multiplyNum(15,10);
		System.out.println(total);
	}

	private static int multiplyNum(int i, int j) {
		int sum=0;
		int k=1;
		
		while(k<=j) {
			sum=sum+i;
			k++;
		}
		
		return sum;
	}

}
