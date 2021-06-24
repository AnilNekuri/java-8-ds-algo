package com.dsguy.datastructures.array;

import java.util.Arrays;

public class SingleDimensionArray {
	int intArray[] = null;
	
	public SingleDimensionArray(final int sizeOfArray) {
		intArray = new int[sizeOfArray];
		Arrays.fill(intArray, Integer.MIN_VALUE);
	}
	
	public void traverseArray() {
		Arrays.stream(intArray)
		.mapToObj(n -> String.valueOf(n).concat(" "))
		.forEach(System.out::print);
	}

	
	
}
