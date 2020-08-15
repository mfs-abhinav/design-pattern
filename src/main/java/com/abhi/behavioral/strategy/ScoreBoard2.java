package com.abhi.behavioral.strategy;

import com.abhi.behavioral.strategy.BaseScoreAlgorithm;

public class ScoreBoard2 {

	public void showScore(BaseScoreAlgorithm baseScoreAlgorithm, int numberOfTaps) {
		System.out.println(baseScoreAlgorithm.calculateScore(numberOfTaps));
	}
}
