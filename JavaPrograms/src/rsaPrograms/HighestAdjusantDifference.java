package rsaPrograms;

public class HighestAdjusantDifference {

	public static void main(String[] args) {
		
		int[] a= {2,4,8,15,17};
		int diff=0;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]-a[i]>diff) {
				diff=a[i+1]-a[i];
			}
		}
		System.out.println(diff);
	}

}
