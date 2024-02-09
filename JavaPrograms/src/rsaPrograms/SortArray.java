package rsaPrograms;

public class SortArray {

	public static void main(String[] args) {
		int[] a = { 1, 9, 2, 6, 5 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i; j < a.length; j++) {

				if(a[i]>a[j]) {
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
