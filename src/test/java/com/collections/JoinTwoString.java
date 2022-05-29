package com.collections;

import java.util.StringJoiner;

public class JoinTwoString {

	public static void main(String[] args) {
		//JOIN TOW STRING
		StringJoiner stJ = new StringJoiner(" ");
		stJ.add("Arif").add("Uddin");
		System.out.println(stJ);
		
		//CONCATENATION
		String name = "Arif";
		String join = name.concat(" Uddin");
		System.out.println(join);
		

	}

}
