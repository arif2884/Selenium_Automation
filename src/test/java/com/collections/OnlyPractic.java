package com.collections;

import java.util.Arrays;
import java.util.stream.Collectors;

public class OnlyPractic {

	public static void main(String[] args) {
		
		int [] abc = {2,3,4,6};
		System.out.println(abc[1]);
		
		for(int i=10; i<=30; i++) {
			if (String.valueOf(i).contains("3")) {
				System.out.println(i);
			}
		}
		
		
		 String str = "Welcome to GFG";
         
	        // Splitting the string based on space and reverse each part
	        // and then join
	        String result = Arrays.asList(str.split(" "))
	                .stream()
	                .map(s -> new StringBuilder(s).reverse())
	                .collect(Collectors.joining(" "));
	 
	        System.out.println(result);
	 
	    }
			}
			

