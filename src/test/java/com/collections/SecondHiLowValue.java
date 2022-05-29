package com.collections;

import java.util.Arrays;

public class SecondHiLowValue {

	public static void main(String[] args) {
		 //Find second highest number & second lowest number
		
	    int[] array = {1,2,45,55,3,4,5,6};
	    int size=array.length;
	    Arrays.sort(array);
	    int secndH = array[size-2];
	    System.out.println(secndH);
//	    int secndL = array[1];
//	    System.out.println("Sorted Array : "+Arrays.toString(array));
//	    System.out.println("2nd Highest element of the array is : "+secndH);
//	    System.out.println("2nd Smallest element of the array is: "+secndL);

	}

}
