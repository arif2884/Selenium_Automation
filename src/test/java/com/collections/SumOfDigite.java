package com.collections;

public class SumOfDigite {

	public static void main(String[] args) {
		
		//sum of a given number
		int num = 256;
		int sum = 0;
		while(num>0) {
			
			sum=sum+num%10;
			
			num=num/10;
						
		}
		System.out.println(sum);


	}

}
