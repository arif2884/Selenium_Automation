package apirestassured.com;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostMethod {
	static String domain = "https://jsonplaceholder.typicode.com";

	@Test
	public void myPostMethod() {
		RestAssured.baseURI = domain;
		RequestSpecification httpRequest = RestAssured.given();
		
		//WE NEED TO USE JSON OBJECT METHOD TO STORE JSON STRING
		JSONObject data = new JSONObject();
		data.put("title", "API from Automation");
		data.put("body", "This is body from Rest Assured");
		data.put("city", "Brooklyn");
		data.put("State", "New York");
		data.put("Name", "Arif");
		
		httpRequest.header("Content-Type", "application/json; charset=utf-8");
		httpRequest.body(data.toJSONString());
		
		Response response = httpRequest.request(Method.POST, "/posts");
		String body = response.getBody().asString();
		System.out.println(body);
		
		int status = response.getStatusCode();
		System.out.println("Status code is: " +status);
		Assert.assertEquals(status,201);
		
		String name = response.jsonPath().get("Name");
		System.out.println("My name is :"+name);
		Assert.assertEquals(name, "Arif");

	}
}
