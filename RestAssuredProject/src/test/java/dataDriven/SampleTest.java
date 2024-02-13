package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class SampleTest {

	public static void main(String[] args) throws IOException {
		DataDrivenTest ddt= new DataDrivenTest();
		ArrayList data=ddt.getData("RestAssured","RestAddBook");
		for(Object d:data) {
			System.out.println(d);
		}
	}

}
