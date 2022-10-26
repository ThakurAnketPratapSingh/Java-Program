package com.anket.api.d;

class SampleClass {
	String str = null;
}

public class StringNewApiRunner {

	public static void main(String[] args) {
		System.out.println(" ".isBlank());
//		System.out.println(" LR ".strip());
//		System.out.println(" LR ".stripLeading());
//		System.out.println(" LR ".stripTrailing());

		System.out.println(" LR ".strip().replace(" ", "@"));
		System.out.println(" LR ".stripLeading().replace(" ", "@"));
		System.out.println(" LR ".stripTrailing().replace(" ", "@"));

//		System.out.println("Line1\nLine2\nLine3\nLine4".lines());
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);

		System.out.println("UPPER".transform(s -> s.substring(2)));

		System.out.println("My name is %s. My age is %d.".formatted("Anket", 22));

		SampleClass sample = new SampleClass();
//		String str = null;
		System.out.println(sample.str.isBlank());

	}

}
