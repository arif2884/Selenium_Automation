package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String string1 = "Greater responsibility";
		int count;

		// Converts given string into character array
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	

		// HOW TO FIND DUPLICATE VALUE
//		String s = "Infosys";
//
//		char[] chars= s.toCharArray();
//
//		Set<Character>obj=new HashSet<Character>();
//
//		for(char ca:chars){
//
//		if(obj.add(ca)==false){
//
//		System.out.println(ca);
//
//		}
//
//
//		}}

		// HOW TO FIND DUPLICATE VALUE
//		List<Integer> a1 = Arrays.asList(2,3,4,3,5,3,6);
//		int [] a1 = {34,55,34,};
//		Set<Integer> b1 = new HashSet<>();
//		for(int i=0;i<a1.length;i++) {
//			if(b1.add(a1[i])==false) {
//				System.out.println("this is duplicate value:"+a1[i]);
//			
//			}
//		}
//		for(int c:a1) {
		// true is for unique value & false find duplicate value
//			if(b1.add(c)==false) {
//				System.out.println("this is duplicate value:"+c);

//How to find Duplicate value?  
//	int [] abc = {44,44,20};
//	for (int i=0;i<abc.length;i++) {
//		for(int j=i+1;j<abc.length;j++) {
//			//if (abc[i].equals(abc[j])) 
//				if (abc[i]==abc[j]) 
//			{
//				System.out.println("this is a duplicate number " +abc[i]);
//				
//			}
//		}
//	}

//	}
//}
	}
}