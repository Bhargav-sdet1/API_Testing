package basicsRestAssured_MapsAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payloads.AddPlace;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.Assert;

public class A3GetResponseasString {
	public static void main(String[] args) {
		
		//Add Place
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		//Response to String
		String response=given().log().all().queryParam("key", "qaclick123")
		.header("Content-Type", "application/json")
		.body(AddPlace.AddPlaceBody())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		System.out.println(response);
		//Extracting Place_Id
		JsonPath js = new JsonPath(response);
		String Place_Id=js.getString("place_id");
		System.out.println(Place_Id);
		System.out.println("******************************");
		
		//Update Place
		String newAddress="70 winter walk, USA";
		given().log().all().queryParam("key", "qaclick123")
		.header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+Place_Id+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "").
		when().put("/maps/api/place/update/json?key=qaclick123")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		System.out.println("******************************");
		
		//Get place
		String getAddress=given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", Place_Id)
		.when().get("/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		JsonPath js1= new JsonPath(getAddress);
		String addedAddress=js1.getString("address");
		
		Assert.assertEquals(addedAddress,newAddress);
	}

}
