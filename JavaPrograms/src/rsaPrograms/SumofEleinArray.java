package rsaPrograms;

public class SumofEleinArray {
	
	
	public static int returnSum(int[] a) {
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] b= {5,5,5,8};
		int total=SumofEleinArray.returnSum(b);
		System.out.println(total);
	}

}
