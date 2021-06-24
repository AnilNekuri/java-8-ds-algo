package com.dsguy.datastructures.recursion;

import reactor.core.publisher.Mono;

public class FibonaciSeriesProblem {
	// 0 1 1 2 3 5 8
	public static void main(String[] args) {
		Mono.just(7231)
		.map(n -> fibonaci(n))
		.subscribe(System.out::println);
	}
	
	private static int fibonaci(int n) {
		if(n < 1) {
			throw new RuntimeException("Not a valid number");
		}else if(n <= 2) {
			return n-1;
		}
		return fibonaci(n - 1) + fibonaci(n - 2);
	}
	
}
