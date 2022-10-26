package com.anket.api.g;

public class TextBlocksRunner {

	public static void main(String[] args) {
		String str = """
				Line1
				  "Line2"
				  
				 Line3
				     Line4
				"Line5"
				Line6
				""";
		System.out.println(str);

	}

}
