package com.anket.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {

		Student student = new Student("Anket Pratap Singh", "AKTU");
//		student.setName("Anket Pratap Singh");
		student.setPhoneNumber("9161153581");
		
		Person person = new Person("Anket Pratap Singh");
		person.setPhoneNumber("9565622282");
		
		
//		System.out.println(student);
		
		Employee employee = new Employee("Anket Pratap Singh", "Product Development Engineer");
		
//		employee.setName("Anket Pratap Singh");
		employee.setPhoneNumber("9161153581");
		employee.setEmail("singhanket5101@gmail.com");
//		employee.setTitel("Product Development Engineer");
		
		System.out.println(employee);

	}


}
