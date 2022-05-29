package com.collections;

public class Fibonachi {

	public static void main(String args[]) {
		int n = 0;
		int n1 = 1;
		int n3;
		int count = 10;

		for (int i = 0; i < count; i++) {
			n3 = n + n1;
			System.out.print(" " + n3);
			n = n1;
			n1 = n3;
		}

	}
}
//static int n1=0,n2=1,n3=0;    
//static void printFibonacci(int count){    
//   if(count>0){    
//        n3 = n1 + n2;    
//        n1 = n2;    
//        n2 = n3;    
//        System.out.print(" "+n3);   
//        printFibonacci(count-1);    
//    }    
//}    
//public static void main(String args[]){    
// int count=10;    
// System.out.print(n1+" "+n2);   
// printFibonacci(count-2);   
//}  
//}  