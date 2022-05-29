package com.collections;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetMethod {
	
	static String domain = "http://dummy.restapiexample.com"; //https://jsonplaceholder.typicode.com/
	@Test
public void myGetMethod() {
	RestAssured.baseURI = domain;
	RequestSpecification httprequest = RestAssured.given();
	Response response = httprequest.request(Method.GET, "/api/v1/employees"); ///posts/1
	String body = response.getBody().asString();
	System.out.println(body);
	int status = response.getStatusCode();
	System.out.println("The status code is: " +status);
	Assert.assertEquals(status, 200);
}
}
