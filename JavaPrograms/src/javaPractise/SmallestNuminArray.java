package arrayPrograms;

public class SmallestNuminArray {

	public static void main(String[] args) {
		
		int[] num= {1,99,3,6,9};
		int smallest=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]<smallest) {
				smallest=num[i];
			}
		}
		System.out.println(smallest);

	}

}
