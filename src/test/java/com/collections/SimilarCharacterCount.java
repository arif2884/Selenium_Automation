package com.collections;

import java.util.HashMap;
import java.util.Map;

public class SimilarCharacterCount {

	static void characterCount2(String s) {

		 
		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j < s.length(); j++) {

				if (s.charAt(i) == s.charAt(j)) {
					count++;

				}
			}
			System.out.println(s.charAt(i) + "=" + count);


		}

	}

//**********************************************************************************************

	static void characterCount(String inputString) {
		// Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] strArray = inputString.toCharArray();

		// checking each char of strArray
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {

				// If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {

				// If char is not present in charCountMap, putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
//**********************************************************************************************

	public static void main(String[] args) {

		String str = "Proud to Be A Bengali";
		str = str.replaceAll("[ ]","").trim();
		characterCount(str);
		
		System.out.println("*********************");

		String str2 = "United States Of America";
		str2 = str2.replaceAll("[ ]","").trim();
		characterCount2(str2);

	}

}
