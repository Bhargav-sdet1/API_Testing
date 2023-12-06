package pojoClassesRestAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;

public class SpecBuilderTest {
	
	@Test
	public void AddPlace() {
		//RestAssured.baseURI="https://rahulshettyacademy.com";
		
		RequestSpecification reqSpec = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				.addQueryParam("key", "qaclick123").setContentType(ContentType.JSON).build();
		ResponseSpecification resSpec = new ResponseSpecBuilder().expectStatusCode(200)
				.expectContentType(ContentType.JSON).build();
		
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
		
		Response res=given().spec(reqSpec)
		.body(sp)
		.when().post("/maps/api/place/add/json")
		.then().spec(resSpec).extract().response();
		
		String resString=res.asString();
		System.out.println(resString);
	}

}
