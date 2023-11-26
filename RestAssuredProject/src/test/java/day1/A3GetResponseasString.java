package day1;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import payloads.AddPlace;
import static io.restassured.RestAssured.*;

public class A3GetResponseasString {
	public static void main(String[] args) {
		
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
	}

}
