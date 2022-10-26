package com.anket.api.c;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3, 64, 7, 45, 2, 87, 84);
//		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
//		numbers.stream().filter(evenNumberPredicate).forEach(System.out::println);
//
//		System.out.println();
//
//		Predicate<Integer> oddNumberPredicate = number -> number % 2 == 0;
//		numbers.stream().filter(oddNumberPredicate.negate()).forEach(System.out::println);
		
//		numbers.stream().filter(PredicateNotRunner::isEven).forEach(System.out::println);
		
		numbers.stream().filter(Predicate.not(PredicateNotRunner::isEven)).forEach(System.out::println);


	}

}
