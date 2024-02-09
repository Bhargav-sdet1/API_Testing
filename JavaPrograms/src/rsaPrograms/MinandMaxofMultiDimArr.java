package rsaPrograms;

public class MinandMaxofMultiDimArr {

	public static void main(String[] args) {
		
		int abc[][]= {{4,2,3},{3,6,7},{1,3,6}};
		int min=abc[0][0];int max=abc[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
				if(max<abc[i][j]) {
					max=abc[i][j];
				}
			}
		}
		System.out.println(min);
		System.out.println(max);
	}

}
