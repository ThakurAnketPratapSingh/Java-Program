package com.anket.oops.level2.abstracts;

public class RecipeRunner {

	public static void main(String[] args) {
		Recipe1 recipe = new Recipe1();
		recipe.execute();
		
		RecipeWithMicroWave recipeWithMicroWave = new RecipeWithMicroWave();
		recipeWithMicroWave.execute();

	}

}
