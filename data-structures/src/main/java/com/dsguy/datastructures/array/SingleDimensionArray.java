package com.dsguy.datastructures.array;

import java.util.Arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

	public void insert(int location, int valueToBeInserted) {
		try {
			if(intArray[location] == Integer.MIN_VALUE) {
				intArray[location] = valueToBeInserted;
				log.debug("Successfully inserted "+valueToBeInserted+" at location "+location);
				log.debug("Successfully inserted {} at location {}.",valueToBeInserted, location);
			}else {
				log.debug("This cell is already occupied with another value.");
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			log.error("Invlid index",e);
		}
	}
	
}
