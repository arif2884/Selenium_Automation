package com.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class MergeTwoArray {
	
	public static void mergeArrays() {
		 // first array
      int[] a = { 40, 20, 30, 10 };  
      // second array
      int[] b = { 80, 60, 70, 50 };
      Arrays.sort(a);
      Arrays.sort(b);      
      // determines length of firstArray
      int a1 = a.length;      
      // determines length of secondArray
      int b1 = b.length;       
      // resultant array size
      int c1 = a1 + b1;
      // create the resultant array
      int[] c = new int[c1];        
      // using the pre-defined function arraycopy
      System.arraycopy(a, 0, c, 0, a1);
      System.arraycopy(b, 0, c, a1, b1);  
      // prints the resultant array
      System.out.println(Arrays.toString(c));
		
	}
	
	
	  // Function to merge arrays
   public static void mergeArrays(int a[], int b[], int n, int m)
    {       
        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer,Boolean> mp = new TreeMap<Integer,Boolean>();
       
        // Inserting values to a map.
        for(int i = 0; i < n; i++)
        {
            mp.put(a[i], true);
        }
        for(int i = 0;i < m;i++)
        {
            mp.put(b[i], true);
        }
       
        // Printing keys of the map.
        for (Map.Entry<Integer,Boolean> me : mp.entrySet())
        {
            System.out.print(me.getKey() + " ");
        }
    }

	public static void main(String[] args) {
		int x[] = {1, 3, 5, 7}, y[] = {2, 4, 6, 8};
        int size = x.length;
        int size1 = y.length;
         
        // Function call
        mergeArrays(x, y, size, size1);
        
        System.out.println();
        
        mergeArrays();
		
		
		
		

    }


	

}
