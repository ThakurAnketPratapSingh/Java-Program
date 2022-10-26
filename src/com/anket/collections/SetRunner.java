package com.anket.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');

		Set<Character> hashSetChars = new HashSet<>(characters);
		System.out.println("Unique Characters: " + hashSetChars);

		Set<Character> treeSetChars = new TreeSet<>(characters);
		System.out.println("Sorted Order: " + treeSetChars);

		Set<Character> linkedSetChars = new LinkedHashSet<>(characters);
		System.out.println("Inserted Order: " + linkedSetChars);
	}

}
