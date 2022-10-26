package com.anket.functionlporgramming;

import java.util.List;
import java.util.stream.IntStream;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		printBasicSum(numbers);
		System.out.println();
		printSumFP(numbers);
		System.out.println();
		printSumOddFP(numbers);
		System.out.println();
		printFPSum(numbers);

		System.out.println("\nSorted");
		numbers.stream().sorted().forEach(elem -> System.out.print(elem + " "));

		System.out.println("\n\nDistinct Sorted");
		numbers.stream().distinct().forEach(elem -> System.out.print(elem + " "));

		System.out.println("\n\nDistinct");
		numbers.stream().distinct().sorted().forEach(elem -> System.out.print(elem + " "));

		System.out.println("\n\nMap");
		numbers.stream().distinct().map(num -> num * num).forEach(elem -> System.out.print(elem + " "));
		
		System.out.println("\n\n");
		printFPSquares();
	}

	private static void printBasicSum(List<Integer> numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		System.out.println(sum);
	}

	private static void printSumFP(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
	}

	private static void printSumOddFP(List<Integer> numbers) {
		int sum = numbers.stream().filter(number -> number % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		System.out.println("Odd Numbers Sum: " + sum);
	}

	private static void printFPSum(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (num1, num2) -> {
			System.out.println(num1 + " " + num2);
			return num1 + num2;
		});
		System.out.println("Numbers Sum: " + sum);
	}

	public static void printFPSquares() {
		IntStream.range(1, 11).map(num -> num * num).forEach(elem -> System.out.println(elem));
	}

}
