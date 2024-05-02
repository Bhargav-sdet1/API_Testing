package numPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=153, temp=num;
		int rem, sum=0;
		
		while(num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(temp==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
		
	}

}
