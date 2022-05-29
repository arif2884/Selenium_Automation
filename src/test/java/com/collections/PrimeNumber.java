package com.collections;

public class PrimeNumber {
	

	    public static void main(String[] args) {
	    	
	    	
	    	for(int i=2; i<=10;i++) {
	    		for(int j=2; j<=10;j++) {
	    			if(j==i) {
	    				System.out.println(i);
	    			}
	    			if(i%j==0) {
	    				break;
	    			}
	    		}
	    	}
	    	


//	         for (int i = 1; i <= 50; i++)         
//	         { 		  	  
//	            int counter=0; 	  
//	            for(int j =i; j>=1; j--){
//	               if(i%j==0){
//	   		counter = counter + 1;
//	  	     }
//	  	  }
//	  	  if (counter ==2){
//	  		  System.out.println(i);
//	  
//	  	  }	
//	         }	

	    	
//****************************************************************************
//	        int i;
//	        int num = 0;
//	        int maxCheck = 100; // maxCheck limit till which you want to find prime numbers
//	        boolean isPrime = true;
//
//	        //Empty String
//	        String primeNumbersFound = "";
//
////	        Start loop 2 to maxCheck
//	        for (i = 2; i <= maxCheck; i++) {
//	            isPrime = CheckPrime(i);
//	            if (isPrime) {
//	                primeNumbersFound = primeNumbersFound + i + " ";
//	            }
//	        }
//	        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
//	        // Print prime numbers from 1 to maxCheck
//	        System.out.println(primeNumbersFound);
//	    }
//	    public static boolean CheckPrime(int numberToCheck) {
//	        int remainder;
//	        for (int i = 2; i <= numberToCheck / 2; i++) {
//	            remainder = numberToCheck % i;
//	            //if remainder is 0 than numberToCheckber is not prime and break loop. Else continue loop
//	            if (remainder == 0) {
//	                return false;
//	            }
//	        }
//	        return true;
//
//	    }

	

}}
