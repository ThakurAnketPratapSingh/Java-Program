package com.anket.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student2.getId(), student1.getId());
	}
	
}

public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Anket"),
				new Student(3, "Anshu"), 
				new Student(2, "Adarsh"));
		
		List<Student> studentsAl = new ArrayList<>(students);
		
		System.out.println(studentsAl);
		

		Collections.sort(studentsAl);		
		System.out.println("AscendingStudentComparator "+studentsAl);
		
		
//		Collections.sort(studentsAl, new DescendingStudentComparator());
		studentsAl.sort(new DescendingStudentComparator());
		System.out.println("DescendingStudentComparator "+studentsAl);
	}

}
