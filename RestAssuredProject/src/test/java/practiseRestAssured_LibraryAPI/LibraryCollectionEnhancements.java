package practiseRestAssured_LibraryAPI;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;


public class LibraryCollectionEnhancements {
	public String id;
	@Test(priority=1)
	public void AddBook() {
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().log().all().headers("Content-Type","application/json")
		.body(payloads.AddBook.AddBookBody("Eat that Frog","12234"))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js= new JsonPath(response);
		id=js.get("ID");
		System.out.println(id);
	}
	
	@Test(priority=2)
	public void getBook() {
		given().log().all().queryParam("AuthorName", "APJ Abdul Kalam")
		.when().get("/Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200);
	}
	@Test(priority=3)
	public void getBookById() {
		given().log().all().queryParam("ID", id)
		.when().get("/Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200);
	}
	
	@Test(priority=4)
	public void deleteBook() {
		given().log().all().queryParam("ID", id)
		.when().delete("/Library/DeleteBook.php")
		.then().log().all().assertThat().statusCode(200);
	}
	
}
