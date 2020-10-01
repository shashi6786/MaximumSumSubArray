package com.shashi;

import com.shashi.factory.MaximumSumSubArrayStrategyFactory;
import com.shashi.strategy.MaximumSumSubArrayStrategy;

public class MaximumSumSubArrayFinder {

    private final MaximumSumSubArrayStrategyFactory factory = new MaximumSumSubArrayStrategyFactory();

    public String findMaximumSumSubArray(int[] input, int k) {
        MaximumSumSubArrayStrategy strategy = factory.getStrategy(input, k);
        return strategy.findMaximumSumSubArray(input, k);
    }
}
