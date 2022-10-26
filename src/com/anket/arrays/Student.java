package com.anket.arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
	
	private String name;
	private ArrayList<Integer> marks = new ArrayList<>();

//	public Student(String name, int... marks) {
//		this.name = name;
//		this.marks = marks;
//	}
	
	public Student(String name, int... marks) {
		this.name = name;
		for(int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}
	
	public int getMaximumMarks() {
		return Collections.max(marks);
	}


	public int getMinimumMarks() {
		return Collections.min(marks);
	}
	
//	public int getMaximumMarks() {
//		int maximum = Integer.MIN_VALUE;
//		for (int mark : marks) {
//			maximum = (maximum < mark)? mark : maximum ;
//		}
//		return maximum;
//	}
//	
//	
//	public int getMinimumMarks() {
//		int minimum = Integer.MAX_VALUE;
//		for (int mark : marks) {
//			minimum = (minimum > mark)? mark : minimum ;
//		}
//		return minimum;
//	}

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}

	@Override
	public String toString() {
		return "Student Name = " + name + ", marks = " + marks;
	}

	public void addNewMark(int mark) {
		this.marks.add(mark);
		
	}

	public  void removeMarksAtIndex(int index) {
		this.marks.remove(index);
		
	}

	
}
