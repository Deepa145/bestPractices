package com.chainsys.bestpractices.abstractDemo;

public class TestScoreBoard {
	public static void main(String args[])
	{
	ScoreBoard sb=ScoreBoard.createObject();
	System.out.println(sb.TargetScore);
	sb.TargetScore=186;
	System.out.println(sb.TargetScore);
}
}
