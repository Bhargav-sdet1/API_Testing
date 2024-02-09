package rsaPrograms;

public class PrimeNumber {
	
	public static String prime(int num) {
		if(num%2!=0 || num==2) {
			return "prime";		}
		else
			return "Not Prime";
	}

	public static void main(String[] args) {
	
		String isPrime=PrimeNumber.prime(7);
		System.out.println(isPrime);
	}

}
