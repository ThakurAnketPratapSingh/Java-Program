package com.hello.firstJavaProgram;

public class HelloWorld {

	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		System.out.println("Anket");
		MotorBike honda = new MotorBike();
		MotorBike ducati = new MotorBike();
		ducati.start();
		honda.start();
		honda.setSpeed(120);
		ducati.setSpeed(100);
		System.out.println("7y6");
		
		
	}


}
