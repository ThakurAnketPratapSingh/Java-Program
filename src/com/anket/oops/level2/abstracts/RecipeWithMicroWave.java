package com.anket.oops.level2.abstracts;

public class RecipeWithMicroWave extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the raw materials");
		System.out.println("Switch on the microwave");
	}

	@Override
	void doThisDish() {
		System.out.println("Get stuff ready");
		System.out.println("Put it in the microwave");
	}

	@Override
	void cleanup() {
		System.out.println("Cleanup the utensil");
		System.out.println("Switch off the microwave");
	}
}
