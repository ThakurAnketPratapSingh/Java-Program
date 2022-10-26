package com.anket.oops.level2.abstracts;

public abstract class AbstractRecipe {
	public void execute() {
		getReady();
		doThisDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doThisDish();

	abstract void cleanup();
}
