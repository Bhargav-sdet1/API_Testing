package javaPractise;

public class Vowels {

	public static void main(String[] args) {
		
		String abc="java";
		String rev="";
		
		for(int i=abc.length()-1;i>=0;i--) {
			System.out.print(abc.charAt(i));
			rev=rev+abc.charAt(i);
		}
		System.out.println();
		System.out.println(rev.toUpperCase());
	}

}
