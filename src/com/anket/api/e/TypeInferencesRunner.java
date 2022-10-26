package com.anket.api.e;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
//		List<String> names1 = List.of("Anket", "Anshu", "Adarsh");
//		List<String> names2 = List.of("Anket", "Raj", "Sonu");
		
		var names1 = List.of("Anket", "Anshu", "Adarsh");
		var names2 = List.of("Anket", "Raj", "Sonu");
		
//		List<List<String>> names = List.of(names1, names2);
		var names = List.of(names1, names2);
		names.stream().forEach(System.out::println);
		
		for(var name:names) {
			System.out.println(name);
		}
		
		for(var i=0; i<5; i++) {
			System.out.println(i);
		}
		
	}

}
