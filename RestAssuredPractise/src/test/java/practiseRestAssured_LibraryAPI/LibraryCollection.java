package practiseRestAssured_LibraryAPI;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;


public class LibraryCollection {

	@Test
	public void AddBook() {
		RestAssured.baseURI="http://216.10.245.166";
		given().log().all().headers("Content-Type","application/json")
		.body(payloads.AddBook.AddBookBody())
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void getBook() {
		given().log().all().queryParam("AuthorName", "APJ Abdul Kalam")
		.when().get("/Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200);
	}
	@Test
	public void getBookById() {
		given().log().all().queryParam("ID", "ram96661")
		.when().get("/Library/GetBook.php")
		.then().log().all().assertThat().statusCode(200);
	}
	
	@Test
	public void deleteBook() {
		given().log().all().queryParam("ID", "ram96661")
		.when().delete("/Library/DeleteBook.php")
		.then().log().all().assertThat().statusCode(200);
	}
	
}
