package stringPrograms;

public class CountPunctuation {

	public static void main(String[] args) {
		String name="Hi! there@ hw' are you?'";
		int count=0;
		
		for(int i=0; i<name.length();i++) {
			if(name.charAt(i) == '!' || name.charAt(i) == '\'' || name.charAt(i) == '?'|| name.charAt(i) == '@') {
				count++;
			}
		}
		System.out.println(count);
	}

}
