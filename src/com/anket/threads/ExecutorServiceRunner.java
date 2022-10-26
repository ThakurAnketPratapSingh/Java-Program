package com.anket.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("\nTask " + number + " Started");
		for (int i = number * 100; i <= number * 100 + 99; i++)
			System.out.print(i + " ");

		System.out.println("\nTask " + number + " Done");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
//		ExecutorService executerService = Executors.newSingleThreadExecutor();
		ExecutorService executerService = Executors.newFixedThreadPool(5);
//		executerService.execute(new Task1());
//		executerService.execute(new Thread(new Task2()));
		executerService.execute(new Task(1));
		executerService.execute(new Task(2));
		executerService.execute(new Task(3));
		executerService.execute(new Task(4));
		executerService.execute(new Task(5));
		executerService.execute(new Task(6));
		executerService.execute(new Task(7));
		executerService.execute(new Task(8));

		/*
		 * // Task3 System.out.println("\nTask3 Kicked off"); for (int i = 301; i <=
		 * 399; i++) { System.out.print(i + " "); } System.out.println("\nTask3 Done");
		 * System.out.println("\nMain Done");
		 */

		executerService.shutdown();

	}

}
