package apirestassured.com;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetMethod {
	// URL = https://jsonplaceholder.typicode.com/posts
	// URL = https://jsonplaceholder.typicode.com/posts/1 <- endpoint URL

	static String domain = "https://jsonplaceholder.typicode.com";

	@Test
	public void myGetMethod() {
		RestAssured.baseURI = domain;
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.request(Method.GET, "/posts/1");
		String body = response.getBody().asString();
		System.out.println(body);
		// To verify something from the body, we need jsonPath method.
		int id = response.jsonPath().get("id");
		System.out.println("The id is : " + id);
		Assert.assertEquals(id, 1);

		// How to verify the Status code?
		int status = response.getStatusCode();
		System.out.println("The status code is: " + status);
		Assert.assertEquals(status, 200);

		// How to verify the content-type header?
		String header = response.header("Content-Type");
		System.out.println("The header is : " + header);
		Assert.assertEquals(header, "application/json; charset=utf-8");

		// How to verify the content-encoding header?
		String contentEncoding = response.header("Content-Encoding");// capture details of Content-Encoding header
		System.out.println("Content Encoding is:" + contentEncoding);
		Assert.assertEquals(contentEncoding, "gzip");
	}

}