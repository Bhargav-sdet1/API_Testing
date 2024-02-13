package veryImp;

public class StringReverse {

	public static void main(String[] args) {
		reverseString("I like selenium");

	}

	private static void reverseString(String string) {
		for(int i=string.length()-1;i>=0;i--) {
			System.out.print(string.charAt(i));
		}
		
	}

}
