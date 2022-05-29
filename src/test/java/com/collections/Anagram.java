
package com.collections;

import java.util.Arrays;

public class Anagram {
	
	//Compare two String and see if they Anagram
	public static void main(String[] args) {
		String name1="Secure";
		String name2="Rescue";
		
		//store the String as lowercase
		name1=name1.toLowerCase(); 
		name2=name2.toLowerCase();
		
		//Check the length of both string if they are equal
		if(name1.length()==name2.length()) { 
			//Then convert to character Array
			char[] chr1 = name1.toCharArray();
			char[] chr2 = name2.toCharArray();
			
			//sort both String
			Arrays.sort(chr1);
			Arrays.sort(chr2);
			
			System.out.println(chr1);
			System.out.println(chr2);
			
			//compare both string and and stroe in a boolean variable
			boolean anagram = Arrays.equals(chr1,chr2);
			if (anagram) {
				System.out.println("Given Strings are Anagram");
			}
			else {
				System.out.println("Given Strings are not Anagram");
			}
		}
		// If length of given sting are not equal
		else {
			System.out.println("Given Strings are not Anagram");
		}
	

	}

}
