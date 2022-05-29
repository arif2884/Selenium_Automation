package com.collections;

public class OverRiding extends OverLoading{
	
	public  void loading(int age) {
		
		System.out.println("I am "+age+" years old");

	}
	
	public void loading(String name) {
		System.out.println("My name is: "+name);

	}
	
	public static void main(String[] args) {
		OverRiding a = new OverRiding();
		a.loading("Arif");
		a.loading(35);
	}

}
