package com.collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("TestData.txt");
		BufferedReader br = new BufferedReader(fr);		
		
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();

	}

}
