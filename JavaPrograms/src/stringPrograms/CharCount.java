package stringPrograms;

public class CharCount {

	public static void main(String[] args) {
		String name="Java Selenium";
		int count = 0;
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
