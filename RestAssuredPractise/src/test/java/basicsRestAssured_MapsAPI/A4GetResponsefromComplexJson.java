package basicsRestAssured_MapsAPI;

import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import payloads.AddPlace;

public class A4GetResponsefromComplexJson {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(AddPlace.CoursesResponse());
				
		//Print No of courses returned by API
		int TotalCourses=js.getInt("courses.size()");
		System.out.println("Total Courses: "+TotalCourses);
		//Print Purchase Amount
		int PurchaseAmount=js.getInt("dashboard.purchaseAmount");
		System.out.println("Purchase Amount: "+PurchaseAmount);
		//Print Title of the first course
		String firstCourse=js.getString("courses[0].title");
		System.out.println("First Course Title: "+firstCourse);
		//Print All course titles and their respective Prices
		String course=null;
		int price=0;
		
		for(int i=0;i<TotalCourses;i++) {
			course=js.getString("courses["+i+"].title");			
			price=js.getInt("courses["+i+"].price");			
			System.out.println("Course "+i+" is "+course+" it's price is: "+price);
		}
		//No of copies sold in RPA course
		String RPAcourse="RPA";
		int rpacopies=0;
		for(int i=0;i<TotalCourses;i++) {
			if(js.getString("courses["+i+"].title").equals(RPAcourse))
			{
				rpacopies=js.getInt("courses["+i+"].copies");
				break;
			}
		}
		System.out.println("RPA Copies sold are: "+ rpacopies);
		
		//Verify if Sum of all courses matches the purchase Amount
		int TotalSum=0;
		int price1=0;
		int copies=0;
		
		for(int i=0;i<TotalCourses;i++) {
			price1=js.getInt("courses["+i+"].price");
			copies=js.getInt("courses["+i+"].copies");
			TotalSum=TotalSum+(price1*copies);
		}
		System.out.println("TotalSum: "+TotalSum);
		Assert.assertEquals(PurchaseAmount, TotalSum);
	}

}
