package patternPrograms;

public class ABBCCCDDDDEEEEE {

	public static void main(String[] args) {

		String a="ABCDE";
		char ch[] = a.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(ch[i]);
			}
			System.out.println();
		}

	}

}
