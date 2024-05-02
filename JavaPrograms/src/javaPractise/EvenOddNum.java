package numPrograms;

public class EvenOddNum {

	public static void main(String[] args) {

		int count=10;
		
		for(int i=1;i<=count;i++) {
			if(i%2 ==0) {
				System.out.print(i);	
			}	
		}
		System.out.println();
		for(int i=1;i<=count;i++) {
			if(i%2 !=0) {
				System.out.print(i);	
			}	
		}

	}

}
