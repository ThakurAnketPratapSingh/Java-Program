package com.anket.api.f;

public class SwitchExpressionRunner {

	public static String findOfTheWeek(int day) {
		String dayOfWeek = null;
		switch (day) {
		case 0: dayOfWeek = "Sunday"; break;
		case 1: dayOfWeek = "Monday"; break;
		case 2: dayOfWeek = "Tuesday"; break;
		case 3: dayOfWeek = "Wednesday"; break;
		default: throw new IllegalArgumentException("Unexpected value: " + day);
		}
		return dayOfWeek;
	}
	
	public static String findOfTheWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> {
			System.out.println("Do some Complex logic here");
			yield "Sunday";
			} 
		case 1 -> dayOfWeek = "Monday";
		case 2 -> dayOfWeek = "Tuesday";
		case 3 -> dayOfWeek = "Wednesday"; 
		default -> throw new IllegalArgumentException("Unexpected value: " + day);
		};
		return dayOfWeek;
	}

	public static void main(String[] args) {
	
	}

}
