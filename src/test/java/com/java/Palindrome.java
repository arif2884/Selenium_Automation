package com.java;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String abc = "dad";
		StringBuilder rev = new StringBuilder(abc).reverse();
		if (abc.equals(rev.toString())) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("This is not palindrome");
		}
	}

}
