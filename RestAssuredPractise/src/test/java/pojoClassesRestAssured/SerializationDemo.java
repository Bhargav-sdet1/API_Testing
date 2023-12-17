package pojoClassesRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class SerializationDemo {
	
	@Test
	public void AddPlace() {
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		SerilizationPojo sp= new SerilizationPojo();
		sp.setAccuracy(50);
		sp.setAddress("Bibinagar");
		sp.setLanguage("Telugu");
		sp.setName("Bhargav");
		sp.setPhone_number("+91 9999999999");
		sp.setWebsite("https://muse.goarya.com");
		List<String> myList = new ArrayList<String>();
		myList.add("Ram");
		myList.add("Sai");
		sp.setTypes(myList);
		Location l= new Location();
		l.setLat(34.5678);
		l.setLng(36.7891);
		
		sp.setLocation(l); 
		
		Response res=given().log().all().queryParam("key", "qaclick123")
		.body(sp)
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response();
		
		String resString=res.asString();
		System.out.println(resString);
	}

}
