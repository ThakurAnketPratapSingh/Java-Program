package com.anket.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericRunner {
	
	static <X> X doubleValue(X value) {
		return value;
	}
	
	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}
	
	// Upper Bound
	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum=0.0;
		for(Number number : numbers) {
			sum+=number.doubleValue();
		}
		return sum;
	}
	
	// Lower Bound
	static void addCoupleOfValue(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

	public static void main(String[] args) {
		
		List emptyList = new ArrayList<Number>();
		addCoupleOfValue(emptyList);
		System.out.println(emptyList);
		
		String value1 = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list2 = doubleValue(new ArrayList());
		
		
		ArrayList<Integer> number = new ArrayList<>(List.of(1,2,3,4));
		duplicate(number);
		System.out.println(number);
		
		LinkedList<Integer> number2 = new LinkedList<>(List.of(1,5,3,4));
		duplicate(number2);
		System.out.println(number2);
		
		
		System.out.println(sumOfNumberList(List.of(1,2,3,4)));
		System.out.println(sumOfNumberList(List.of(1.2,2.2,3.0,4.8)));
		System.out.println(sumOfNumberList(List.of(1l,2l,3l,4l)));
		
		
		MyCustomList<String>  list = new MyCustomList<>();
		list.addElement("Element 1");
		list.addElement("Element 2");
		System.out.println(list.get(0));
		System.out.println(list);
		
		MyCustomList<Integer>  list1 = new MyCustomList<>();
		list1.addElement(4);
		list1.addElement(Integer.valueOf(7));
		list1.addElement(Integer.valueOf(3));
		list1.addElement(5);
		System.out.println(list1);
	}

}
