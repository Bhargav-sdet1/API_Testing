package stepDefinitions;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import io.cucumber.java.en.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resources.TestData;
import resources.Utils;

public class AddPlace extends Utils {

	RequestSpecification request;
	Response response;

	@Given("Add place Payload with {string} {string} {string}")
	public void add_place_payload_with(String name, String language, String address) throws IOException {
		request = given().spec(requestSpec()).body(TestData.addPlacePayload(name, language, address));
	}

	@When("user calls {string} API with POST http request")
	public void user_calls_api_with_post_http_request(String string) {
		response = request.when().post("/maps/api/place/add/json").then().spec(responseSpec()).extract().response();
	}

	@Then("Verify API call got success with status code {int}")
	public void verify_api_call_got_success_with_status_code(Integer statusCode) {
		assertEquals(response.getStatusCode(), 200);

	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
		String jsonResponse = response.asString();
		JsonPath js = new JsonPath(jsonResponse);
		js.get(key.toString());
		assertEquals(js.get(key.toString()), value);
	}
}
