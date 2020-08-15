package com.abhi.behavioral.strategy;

import com.abhi.behavioral.strategy.BaseScoreAlgorithm;

public class Clown implements BaseScoreAlgorithm {

	@Override
	public int calculateScore(int numberOfTaps) {
		return numberOfTaps * 10;
	}

}
