package resources;

import java.util.ArrayList;
import java.util.List;

import pojoClasses.AddDetails;
import pojoClasses.Location;

public class TestData {

	public static AddDetails addPlacePayload() {
		
		AddDetails ad; 
		Location loc; 
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
		
		return ad;
	}
}
