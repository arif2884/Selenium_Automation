package com.collections;

public class OverLoading {

	public void loading(int age) {
		System.out.println("I am "+age+ " years old");

	}

	public void loading(String name) {
		System.out.println("My name is: "+name);

	}

	public void loading(String name, int age) {
		System.out.println(name+" is "+age+" years old");

	}

}
