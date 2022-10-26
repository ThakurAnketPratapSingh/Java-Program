package com.anket.oops.level2.interfaces;

public class GameRunner {

	public static void main(String[] args) {
//		MarioGame game = new MarioGame();
//		GamingConsole game = new MarioGame();
//		GamingConsole game = new ChessGame();
//		game.up();
//		game.down();
//		game.left();
//		game.right();
		
		GamingConsole[] games = {new ChessGame(), new MarioGame()};
		for(GamingConsole game : games) {
			game.up();
			game.down();
			game.left();
			game.right();
			System.out.println();
		}
			


	}

}
