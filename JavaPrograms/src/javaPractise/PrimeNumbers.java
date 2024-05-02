package numPrograms;

public class PrimeNumbers {

	public static void main(String[] args) {
		int num = 10;
		for (int i = 2; i < num; i++) {

			if (i % 2 != 0 || i == 2) {
				System.out.println(i+" is prime");
			} else {
				System.out.println(i+" is not Prime");
			}
		}
	}

}
