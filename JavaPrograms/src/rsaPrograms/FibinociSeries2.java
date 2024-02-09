package rsaPrograms;

public class FibinociSeries2 {

	public static void main(String[] args) {
		int count=9; int a=0, b=1, c;
		System.out.print(a+" "+b);
		for(int i=2;i<count;++i) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
