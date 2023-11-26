package day1;

import io.restassured.RestAssured;
import payloads.AddPlace;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ValidateResponseBody {
	public static void main(String[] args) {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		given().log().all().queryParam("key", "qaclick123")
		.header("Content-Type", "application/json")
		.body(AddPlace.AddPlaceBody())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope",equalTo("APP"))
		.header("Server", equalTo("Apache/2.4.52 (Ubuntu)"));
	}

}
