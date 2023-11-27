package payloads;

public class AddBook {
	
	public static String AddBookBody(String isbn, String aisle)
	{
		String AddBookres= "{\r\n"
				+ "\"name\":\"Learn RestAssured Automation with Java\",\r\n"
				+ "\"isbn\":\""+isbn+"\",\r\n"
				+ "\"aisle\":\""+aisle+"\",\r\n"
				+ "\"author\":\"APJ Abdul Kalam\"\r\n"
				+ "}\r\n"
				+ "";
		return AddBookres;
	}
	public static String AddBookBody()
	{
		return "{\r\n"
				+ "\"name\":\"Learn RestAssured Automation with Java\",\r\n"
				+ "\"isbn\":\"ram\",\r\n"
				+ "\"aisle\":\"1234\",\r\n"
				+ "\"author\":\"APJ Abdul Kalam\"\r\n"
				+ "}\r\n"
				+ "";
	}
}
