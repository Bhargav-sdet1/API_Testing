package stringPrograms;

public class AnagramorNot {

	public static void main(String[] args) {
		String str1="Madam";
		String str2="Madam";
		
		/*
		 * if(str1.length() !=str2.length()) { System.out.println("Not Anagram"); }
		 */
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
