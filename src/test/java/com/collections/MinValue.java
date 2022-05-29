package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinValue {

	public static void main(String[] args) {
		
		int[] arry= {20,10,5,30,40};
		int min=Arrays.stream(arry).min().getAsInt();
		System.out.println("minimum vaue is: "+min);
		
		//FIND MINIMUM VALUE

		List<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);

		int minvalue = Collections.min(num);
		System.out.println("minimum vaue is:" + minvalue);

	}

}
