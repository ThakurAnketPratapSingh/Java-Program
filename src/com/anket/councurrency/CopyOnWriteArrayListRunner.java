package com.anket.councurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		
		//Thread - 3
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");
		
		//Thread - 10000
		for(String element : list) {
			System.out.println(element);
		}
	}
}
