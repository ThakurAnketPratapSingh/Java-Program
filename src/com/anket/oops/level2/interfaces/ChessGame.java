package com.anket.oops.level2.interfaces;

public class ChessGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Move Piece up");
	}

	@Override
	public void down() {
		System.out.println("Move Piece down");
	}

	@Override
	public void left() {
		System.out.println("Move Piece left");
	}

	@Override
	public void right() {
		System.out.println("Move Piece right");
	}

}
