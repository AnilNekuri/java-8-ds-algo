package com.dsguy.datastructures.recursion;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

public class FactorialProgram {

	public static void main(String[] args) {
		Mono.just(5)
		.map(n -> factorial(n))
		.subscribe(System.out::println);
	}
	
	private static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
}
