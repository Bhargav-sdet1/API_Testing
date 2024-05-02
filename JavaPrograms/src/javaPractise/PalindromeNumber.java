package numPrograms;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num=121, temp=num;
		int rem, rev = 0;
		
		while(num!=0) {
			rem=num%10;
			rev=rem+rev*10;
			num=num/10;
		}
				
		if(temp==rev) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
	}

}
