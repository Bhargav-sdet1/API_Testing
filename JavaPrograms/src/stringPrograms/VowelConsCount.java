package stringPrograms;

public class VowelConsCount {

	public static void main(String[] args) {
		String str = "I am automation tester";
		int cCount = 0;
		int vCount = 0;
		int spaceCount=0;

		for (int i = 0; i <= str.length() - 1; i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				cCount++;
			}
			else if(str.charAt(i) == ' ') {
				spaceCount++;
			}
			else {
				vCount++;
			}
		}
		System.out.println("ConsonantCount is:"+cCount);
		System.out.println("spaceCount is:"+spaceCount);
		System.out.println("VowelCount is:"+vCount);
	}

}
