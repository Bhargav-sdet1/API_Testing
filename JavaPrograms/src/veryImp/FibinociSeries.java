package veryImp;

public class FibinociSeries {

	public static void main(String[] args) {
		int count = 10;
		int a1 = 0;
		int a2 = 1;
		int a3 = 0;

		System.out.print(a1 + " " + a2);
		for (int i = 2; i < count; ++i) {
			a3 = a2 + a1;
			a1 = a2;
			a2 = a3;
			System.out.print(" "+a3);

		}
	}

}
