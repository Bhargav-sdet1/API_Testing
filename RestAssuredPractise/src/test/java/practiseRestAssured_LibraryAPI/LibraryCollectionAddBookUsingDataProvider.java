package practiseRestAssured_LibraryAPI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;


public class LibraryCollectionAddBookUsingDataProvider {
	
	public String id;
	@Test(priority=1,dataProvider="BooksData")
	public void AddBook(String isbn,String aisle) {
		RestAssured.baseURI="http://216.10.245.166";
		String response=given().log().all().headers("Content-Type","application/json")
		.body(payloads.AddBook.AddBookBody(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		JsonPath js= new JsonPath(response);
		id=js.get("ID");
		System.out.println(id);
	}
	
	@DataProvider(name="BooksData")
	public Object[][] getData()
	{
		return new Object[][] {{"abcd","1234"},{"efgh","5678"},{"ijkl","9121"}};
	}
	
	
}
