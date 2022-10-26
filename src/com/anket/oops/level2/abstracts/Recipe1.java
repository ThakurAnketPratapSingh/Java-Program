package com.anket.oops.level2.abstracts;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Get the utensil");
	}

	@Override
	void doThisDish() {
		System.out.println("do the dish");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensil");
	}

}
