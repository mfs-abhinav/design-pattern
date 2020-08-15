package com.abhi.behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		System.out.println("--------------strategy pattern starts--------------");
		
		System.out.println("--------------strategy pattern using instance variable--------------");
		ScoreBoard1 sb1 = new ScoreBoard1();

		System.out.print("Ballon tap score is: ");
		sb1.baseScoreAlgorithm = new Balloon();
		sb1.showScore(2);
		
		System.out.print("Clown tap score is: ");
		sb1.baseScoreAlgorithm = new Clown();
		sb1.showScore(2);
		
		System.out.print("SquareBalloon tap score is: ");
		sb1.baseScoreAlgorithm = new SquareBalloon();
		sb1.showScore(2);
		
		
		System.out.println("--------------strategy pattern using method variable--------------");
		ScoreBoard2 sb2 = new ScoreBoard2();

		System.out.print("Ballon tap score is: ");
		sb2.showScore(new Balloon(), 2);
		
		System.out.print("Clown tap score is: ");
		sb2.showScore(new Clown(), 2);
		
		System.out.print("SquareBalloon tap score is: ");
		sb2.showScore(new SquareBalloon(), 2);
		
		System.out.println("--------------strategy pattern ends--------------");

	}

}
