package com.anket.exceptionhandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] numbers = { 1, 2, 5, 4 };
			int number = numbers[5];

		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			if (scanner != null)
				scanner.close();
		}
		System.out.println("Just before closing out main");
	}

}
