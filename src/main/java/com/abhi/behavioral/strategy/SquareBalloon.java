package com.abhi.behavioral.strategy;

import com.abhi.behavioral.strategy.BaseScoreAlgorithm;

public class SquareBalloon implements BaseScoreAlgorithm {

	@Override
	public int calculateScore(int numberOfTaps) {
		return numberOfTaps * 30;
	}

}
