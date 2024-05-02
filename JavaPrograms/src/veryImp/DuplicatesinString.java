package stringPrograms;

public class DuplicatesinString {

	public static void main(String[] args) {
		
		String name="hi".toLowerCase();
		char[] ch=name.toCharArray();
		boolean isNotDuplicates=false;
		
		  for(int i=0;i<name.length();i++) {
			  boolean isDuplicate=false;
			  for(int j=i+1;j<name.length();j++) {
				  if(ch[i]==ch[j]) {
					  isDuplicate=true;
					  break;
				  }
			  }
			  if(isDuplicate) {
				  System.out.print	(ch[i]);
				  isNotDuplicates=true;
			  }
			  
		  }
		  
		  if(!isNotDuplicates){ System.out.println("No Duplicates"); }
		 

	}

}
