package ecomE2E;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojoClassesRestAssured.EcomCreateOrder;
import pojoClassesRestAssured.EcomLoginDeser;
import pojoClassesRestAssured.EcomLoginSer;
import pojoClassesRestAssured.EcomOrders;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EcomE2E {
	
	String token;
	String userId;
	String productId;
	String deleteMessage ="Product Deleted Successfully";
	
	@Test(priority=1)
	public void Login() {
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.setContentType(ContentType.JSON).build();
		
		EcomLoginSer elogin = new EcomLoginSer();
		elogin.setUserEmail("nov9@yopmail.com");
		elogin.setUserPassword("Asdfg1@34");
		
		RequestSpecification reqLogin=given().spec(req).body(elogin);
		
		EcomLoginDeser loginResponse=reqLogin.log().all().when().post("/api/ecom/auth/login")
		.then().log().all().extract().response().as(EcomLoginDeser.class);
		
		token=loginResponse.getToken();
		System.out.println(token);
		userId=loginResponse.getUserId();
		System.out.println(userId);
	}
	
	@Test(priority=2)
	public void CreateProduct() {
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.addHeader("Authorization",token)
		.addParam("productName", "qwerty")
		.addParam("productAddedBy", userId)
		.addParam("productCategory", "fashion")
		.addParam("productSubCategory", "shirts")
		.addParam("productPrice", "11500")
		.addParam("productDescription", "Addias Originals")
		.addParam("productFor", "women")	
		.addMultiPart("productImage", new File("C:\\Users\\bharg\\OneDrive\\Pictures\\Camera Roll\\WIN_20230715_12_55_07_Pro.jpg")).build();
		
		String res=given().log().all().spec(req)
		.when().post("/api/ecom/product/add-product")
		.then().statusCode(201).extract().response().asString();
	
		JsonPath js =new JsonPath(res);
		productId=js.get("productId");
		System.out.println(productId);
		
	}
	
	@Test(priority=3)
	public void createOrder() {
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.addHeader("Authorization", token).setContentType(ContentType.JSON).build();
		
		EcomOrders order= new EcomOrders();
		order.setCountry("India");
		order.setProductOrderedId(productId);
		
		List<EcomOrders> ordersList= new ArrayList<EcomOrders>();
		ordersList.add(order);
		
		EcomCreateOrder createOrders = new EcomCreateOrder();	
		createOrders.setOrders(ordersList);
		
		String response=given().log().all().spec(req).body(createOrders)
		.when().post("/api/ecom/order/create-order")
		.then().log().all().extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		js.get("orders");
		String ProductId=js.get("productOrderId[0]");
		
		Assert.assertEquals(productId,ProductId);
		
	}
	
	@Test(priority=4)
	public void DeleteProduct() {
		
		RequestSpecification req=new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
		.addHeader("Authorization", token).build();
		
		
		String response=given().pathParam("productId", productId).log().all().spec(req)
		.when().delete("/api/ecom/product/delete-product/{productId}")
		.then().extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String deleteResponse=js.get("message");
		System.out.println(deleteResponse);
		Assert.assertEquals(deleteResponse, deleteMessage);
	}

}
