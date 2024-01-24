package stringPrograms;

public class PunctuationsCount {

	public static void main(String[] args) {
		String str="I am Java 'automation tester'..!";
		int punCount=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			
			if(str.charAt(i)=='!' || str.charAt(i)=='.' 
					|| str.charAt(i)== ',' || str.charAt(i)=='\'') {
				punCount++;
			}
		}
		System.out.println(punCount);
		

	}

}
