package com.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String> listAll = Arrays.asList("arif","arif","Uddin");
		Set<String>s=new HashSet<String>(listAll);
		System.out.println(s);
		
		// how to remove duplicate in ArrayList
		List<String> name = Arrays.asList ("java","python","ruby","java");
		List<String> remv = name.stream().distinct().collect(Collectors.toList());
		System.out.println(remv);

	}

}
