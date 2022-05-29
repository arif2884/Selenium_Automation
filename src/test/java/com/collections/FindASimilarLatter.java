package com.collections;

public class FindASimilarLatter {

	public static void main(String[] args) {
		
		//Find how many similar letter
		String latter = "be proud to be a bengali";

		int count = 0;
		for (int i = 0; i < latter.length(); i++) {
			if (latter.charAt(i)== 'e') {
				count++;
				System.out.println(latter.charAt(i));
				
			}
			
		}
		System.out.println("Total count of E:" + count);


	}

}
