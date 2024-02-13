package veryImp;

public class IntegerReverse {

	public static void main(String[] args) {
		reverseNumber(9666);
	}

	private static void reverseNumber(int num) {
		int reminder;
		int reverse = 0;
		
		while(num>0) {
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;	
		}
		
		System.out.println(reverse);
	}
	

}
