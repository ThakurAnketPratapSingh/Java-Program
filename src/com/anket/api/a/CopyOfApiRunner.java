package com.anket.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Anket");
		names.add("Anshu");
		names.add("Adarsh");
		
		// Make unmodifiable List
		List<String> copyOfName = List.copyOf(names);
		
		doNotChange(names);
//		doNotChange(copyOfName);
		System.out.println(names);
		System.out.println(copyOfName);

	}

	private static void doNotChange(List<String> names) {
		names.add("ShouldNotBeAllowed");
		
	}

}
