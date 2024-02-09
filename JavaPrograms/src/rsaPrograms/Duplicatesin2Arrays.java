package rsaPrograms;

import java.util.ArrayList;

public class Duplicatesin2Arrays {

	public static void main(String[] args) {
		int a[] = {4,1,3,5,7};
		int b[] = {7,2,3,4,5};
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i] == b[j]) {
					al.add(a[i]);
				}
			}		
		}
		Object[] c=al.toArray();
		for(Object x:c) {
			System.out.print(x+" ");
		}
	}

}
