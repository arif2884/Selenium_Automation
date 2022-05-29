package com.collections;

public class FindVowels {

	public static void main(String[] args) {
		
		//Find vowels
		String test = "ABCDEFGHIJKLMNOP";

		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == 'A' || test.charAt(i) == 'E' || test.charAt(i) == 'I' || test.charAt(i) == 'O'
					|| test.charAt(i) == 'U') {
				System.out.println(test.charAt(i) + "  =  " + i);

			}

		}

	}

}
