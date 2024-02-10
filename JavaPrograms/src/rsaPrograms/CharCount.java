package rsaPrograms;

public class CharCount {

	public static void main(String[] args) {
		int charCount=characOccurance("ababaaa",'b');
		System.out.println(charCount);
	}

	private static int characOccurance(String word, char c) {
		
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}

}
