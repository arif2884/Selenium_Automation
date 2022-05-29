package com.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareList {

	public static void main(String[] args) {
		List<String> listAll = Arrays.asList("CO2","CH4","SO2","CO2","CH5","SO2","AB2");
		List<String> listNo = Arrays.asList("CO2","CH4","SO2");
		List<String> notMatched = listAll.stream().filter(x ->!listNo.contains(x))
				.collect(Collectors.toList());
System.out.println(notMatched);
	}

}
