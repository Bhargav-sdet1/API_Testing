package javaPractise;

public class ImmutableStrings {

	public static void main(String[] args) {
	
		StringBuffer sb= new StringBuffer("abcdefg");
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.append("hijklm");
		System.out.println(sb);
		sb.insert(3, '3');
		System.out.println(sb);
		sb.delete(3, 4);
		System.out.println(sb);
	}

}
