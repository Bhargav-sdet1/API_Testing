package veryImp;

public class Palindrome {

	public static void main(String[] args) {
		int num=5995;int actNum=num;
		int rev=0; int rem;
		
		while(num>0) {
			rem=num%10;
			rev=rem+rev*10;
			num=num/10;
		}
		if(actNum==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
