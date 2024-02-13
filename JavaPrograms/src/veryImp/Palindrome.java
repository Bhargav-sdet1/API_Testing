package veryImp;

public class Palindrome {

	public static void main(String[] args) {
		palindromeCount(16);
	}

	private static void palindromeCount(int count) {
		int a1=0, a2=1;
		System.out.print(a1+" "+a2);
		
		int a3;
		for(int i=2;i<count;++i) {
			a3=a1+a2;
			System.out.print(" "+a3);
			a1=a2;
			a2=a3;
		}
		
	}

}
