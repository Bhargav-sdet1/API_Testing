package arrayPrograms;

public class LargestNuminArray {

	public static void main(String[] args) {
		
		int[] num= {1,99,3,6,9};
		int largest=num[0];
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>largest) {
				largest=num[i];
			}
		}
		System.out.println(largest);

	}

}
