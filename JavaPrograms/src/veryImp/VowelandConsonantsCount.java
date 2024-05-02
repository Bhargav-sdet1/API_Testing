package stringPrograms;

public class VowelandConsonantsCount {

	public static void main(String[] args) {
		int vCount=0, cCount=0;
		
		String name="Bhargav ram".toLowerCase();
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a' ||name.charAt(i)=='e' ||name.charAt(i)=='i' 
					||name.charAt(i)=='o' ||name.charAt(i)=='u') {
				vCount++;
			}
			else if(name.charAt(i) !=' ') {
				cCount++;
			}
		}
		System.out.println("Vowels count: "+vCount);
		System.out.println("Consonants count: "+cCount);
	}

}
