package com.abhi.behavioral.strategy;

import com.abhi.behavioral.strategy.BaseScoreAlgorithm;

public class ScoreBoard1 {
	public BaseScoreAlgorithm baseScoreAlgorithm;
	
	public void showScore(int numberOfTaps) {
		System.out.println(baseScoreAlgorithm.calculateScore(numberOfTaps));
	}
}
