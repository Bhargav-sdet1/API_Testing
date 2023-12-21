package stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojoClasses.AddDetails;
import pojoClasses.Location;

public class AddPlace {
	AddDetails ad; 
	Location loc;
	RequestSpecification request;
	ResponseSpecification res;
	Response response;
	
	@Given("Add place Payload")
	public void add_place_payload() {
		loc = new Location();
		loc.setLat(-345.23);
		loc.setLng(234.123);
		
		List<String> myList=new ArrayList<String>();
		myList.add("Shoe Park");
		myList.add("Shop");
		
		ad= new AddDetails();
		ad.setAccuracy(50);
		ad.setAddress("Pochampally Road");
		ad.setLanguage("Telugu");;
		ad.setLocation(loc);
		ad.setName("Bhargav");
		ad.setPhone_number("+919999999999");
		ad.setTypes(myList);
		ad.setWebsite("http://google.com");
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.setContentType(ContentType.JSON).build();
		
		res=new ResponseSpecBuilder().expectStatusCode(200)
				.expectContentType(ContentType.JSON).build();
		
		request= given().log().all().spec(req).body(ad);
		
		
		
	}

	@When("user calls {string} API with POST http request")
	public void user_calls_api_with_post_http_request(String string) {
		response=request.when().post("/maps/api/place/add/json")
	    .then().log().all().spec(res).extract().response();
	}

	@Then("Verify API call got success with status code {int}")
	public void verify_api_call_got_success_with_status_code(Integer statusCode) {
	    assertEquals(response.getStatusCode(), 200);
		
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
	  String jsonResponse=  response.asString();
	  JsonPath js= new JsonPath(jsonResponse);
	  js.get(key.toString());
	  assertEquals(js.get(key.toString()), value);
	}
}
