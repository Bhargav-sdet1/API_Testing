package javaPractise;

public class Sample{
	
	public static void add(int a, int b) {
		System.out.println("Sum is:"+(a+b));
	}
	public void sum(int a, int b) {
		System.out.println("Sum is:"+(a+b));
	}
	public static void main(String[] args) {
		Sample.add(2, 3);
		Sample sam= new Sample();
		sam.sum(9, 1);
	}
}