package com.anket.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in);) {
			
			int[] numbers = { 1, 2, 5, 4 };
			int number = numbers[5];
 
		} 
	}

}
