package com.collections;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		
		// HOW TO SPLIT
		String abc= "United State of America";
				String [] xyz = abc.split(" ");
				System.out.println(Arrays.toString(xyz));
				for(int i=0; i < xyz.length; i++){
				
				System.out.println(xyz[i]);                               
				}

	}
	
}


