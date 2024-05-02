package stringPrograms;

public class StringCopy {

	public static void main(String[] args) {

		String s2 = "Grab";
		String s3 = "";

		for (int i = s2.length() - 1; i >= 0; i--) {
			s3 = s3 + s2.charAt(i);
		}

		System.out.println(s3);

	}

}
