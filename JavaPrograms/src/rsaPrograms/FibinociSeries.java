package rsaPrograms;

public class FibinociSeries {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13 21 34
		
		int a1=0, a2=1, a3, count=10;
		
		System.out.print(a1+" "+a2); //0 1
		
		for(int i=2;i<count;++i) { 
			a3=a1+a2;
			System.out.print(" "+a3); // 1 2 3 5 
			a1=a2; //1
			a2=a3; //1	
		}
		
		
	}

}
