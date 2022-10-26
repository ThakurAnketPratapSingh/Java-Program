package com.anket.threads;

class Task1 extends Thread {

	@Override
	public void run() {
		System.out.println("Task1 Started");
		for (int i = 101; i <= 200; i++)
			System.out.print(i + " ");

		// Thread.yield();

		System.out.println("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for (int i = 201; i <= 300; i++)
			System.out.print(i + " ");

		System.out.println("\nTask2 Done");

	}

}

public class ThreadBasicRunner {

	public static void main(String[] args) throws InterruptedException {

		// Task1
		System.out.println("\nTask1 Kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start(); // task1.run();

		// Task2
		System.out.println("Task2 Kicked off");
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2);
		task2thread.start();
		/*
		 * for (int i = 201; i <= 299; i++) { System.out.print(i + " "); }
		 * System.out.println("\nTask2 Done");
		 */

		// wait for taks1 to complete
		task1.join();

		// wait for taks2 to complete
		task2thread.join();

		// Task3
		System.out.println("\nTask3 Kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
		System.out.println("\nMain Done");

	}
}
