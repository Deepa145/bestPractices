package com.chainsys.bestpractices.abstractdemo;

public class ScoreBoard {
	public int TargetScore = 215;

	private ScoreBoard() {
		System.out.println("Object created for scoreboard");
	}// create object() is is a factory method 

	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
}
