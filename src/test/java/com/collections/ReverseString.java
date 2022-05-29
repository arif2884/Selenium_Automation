package com.collections;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a String using reverse method
		String abc = "Arif";
        StringBuilder str = new StringBuilder(abc);
//        str.reverse();     // used string builder to reverse
        StringBuilder rev1 = str.reverse();
	
       System.out.println(rev1);
       
     //Reverse a String using for loop
       String name = "America";
       String rev = "";
       for(int i=name.length()-1; i>=0;i--) {
    	 rev = rev + name.charAt(i);   
       }
       System.out.println(rev);
        }


	

}
