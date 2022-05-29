package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxValue {

	public static void main(String[] args) {
		
		int [] arry = {46,56,70,30,90};
		int max=Arrays.stream(arry).max().getAsInt();
		System.out.println("maximum value is: "+max);
	

		List<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

		int maxvalue = Collections.max(num);
		System.out.println("maximum value is:" + maxvalue);
		

	}
}
