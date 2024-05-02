package stringPrograms;

public class StringAnagrams {

	public static void main(String[] args) {
		String s1 = "Brag";
		String s2 = "Garb";
		String s3 = "";

		for (int i = s2.length() - 1; i >= 0; i--) {
			s3 = s3 + s2.charAt(i);
		}

		if (s1.equalsIgnoreCase(s3)) {
			System.out.println("Anagram");
		} else
			System.out.println("Not Anagram");
	}

}
