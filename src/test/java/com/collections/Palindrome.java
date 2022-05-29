package com.collections;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		
//	      String str, rev = "";		 
//	    
//	      Scanner sc = new Scanner(System.in);
//	 
//	      System.out.println("Enter a string:");
//	      
//	      str = sc.nextLine();
//	 
//	      int length = str.length();
//	 
//	      for ( int i = length - 1; i >= 0; i-- ) 
//	       rev = rev + str.charAt(i);
//	 
//	      if (str.equalsIgnoreCase(rev))
//	         System.out.println(str+" is a palindrome");
//	      else
//	         System.out.println(str+" is not a palindrome");
	 
//*********************************************************************	      
	
//		String str = "abjcba";
//		String strNew = str.replaceFirst("ab", "");

		// PALINDROM
//		String abc= "DAd";
//		StringBuilder rev = new StringBuilder(abc).reverse();
//		if (abc.equalsIgnoreCase(rev.toString())) {
//			System.out.println("This is a palindrom");
//		} else {
//			System.out.println("This is not palindrom");
//		}
//**********************************************************************		
		  String rev1 = "Mom";
		  
		  System.out.println("Enter a string: " +rev1);
		  
		  String count="";
		  
	      for ( int i =rev1.length()-1; i>=0;i--) 
	    	 
	         count = count + rev1.charAt(i);  
	         
	      if (rev1.equalsIgnoreCase(count)) 
	    	  
	         System.out.println(rev1+" is a palindrome.");  
	      
	      else 
	         System.out.println(rev1+" isn't a palindrome."); 
	      
	       
	      
	   }



	}


