package com.anket.arrays;

import java.math.BigDecimal;

public class StudentRunner {
	
	public static void main(String[] args) {
		int [] marks = {99, 97, 100};
		Student student = new Student("Anket", marks);
		int number = student.getNumberOfMarks(); 
		int sum = student.getTotalSumOfMarks();
		int MaximumMarks = student.getMaximumMarks();
		int MinimumMarks = student.getMinimumMarks();
		BigDecimal average = student.getAverageMarks();
		
		student.addNewMark(35);
		student.removeMarksAtIndex(1);
		
		System.out.println(student);
		System.out.println("number of marks : " + number);
		System.out.println("Sum of marks : " + sum);
		System.out.println("Maximum of marks : " + MaximumMarks);
		System.out.println("Minimum of marks : " + MinimumMarks);
		System.out.println("Average of marks : " + average);
		
		System.out.println("\n");
		
		
		Student student1 = new Student("Anshu", 99, 97, 89, 88);
		
		System.out.println(student1);
		System.out.println("number of marks : " + student1.getNumberOfMarks());
		System.out.println("Sum of marks : " + student1.getTotalSumOfMarks());
		System.out.println("Maximum of marks : " + student1.getMaximumMarks());
		System.out.println("Minimum of marks : " + student1.getMinimumMarks()); 
		System.out.println("Average of marks : " + student1.getAverageMarks());
		
		
		
	}


}
