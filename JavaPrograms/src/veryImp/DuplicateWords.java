package stringPrograms;

public class DuplicateWords {

	public static void main(String[] args) {
		String str="this is java programming java this is selenium".toLowerCase();

		int count;

		String[] words=str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			count=1;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(words[i]);
			}
		}
	}

}
