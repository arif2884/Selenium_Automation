package com.collections;

public class Abc {
	
	public static void getSalary(int salary){
		int a = salary;
		System.out.println(a);

		}
//====================================================================
		public void getSalary(int salary, int money){
			int b=salary;
			int c=money;
		System.out.println(b);
		System.out.println(c);

		}
//=====================================================================
	public static void main(String[] args) {
		
		

			for(int i = 1; i<50; i++){
			if(i%3==0 && i%5==0){
			System.out.println(i+ "FizzBuzz");
			}
			else if (i%3==0){
			System.out.println(i+"Fizz");
			}
			else if (i%5==0){
			System.out.println(i+"Buzz");
			}
			else if(i%7==0) {
				System.out.println(i+"Tazz");
			}


			}


			}}
//		Abc.getSalary(300000);
//
//		Abc obj = new Abc();
//			obj.getSalary(10000,20000);
	
//
//	}
//
//}
