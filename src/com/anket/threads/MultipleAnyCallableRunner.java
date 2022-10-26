package com.anket.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class MultipleAnyCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);

		List<CallableTask> tasks = List.of(new CallableTask("Anket"), new CallableTask("Anshu"),
				new CallableTask("Adarsh"));

		String results = executorService.invokeAny(tasks);

		System.out.println(results);

		executorService.shutdown();

	}

}
