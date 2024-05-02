package numPrograms;

public class FibinacciSeries {

	public static void main(String[] args) {
		
		int n1=0, n2=1;
		int count=11;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<count;++i) {
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
		}
		

	}

}
