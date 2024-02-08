package rsaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String a="I am Bhargav goud";
		
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
		
		String[] str=a.split(" ");
		
		
	}

}
