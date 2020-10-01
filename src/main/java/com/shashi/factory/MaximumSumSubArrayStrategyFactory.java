package com.shashi.factory;

import com.shashi.strategy.InvalidMaximumSumSubArrayStrategy;
import com.shashi.strategy.MaximumSumSubArrayStrategy;
import com.shashi.strategy.ValidMaximumSumSubArrayStrategy;

public class MaximumSumSubArrayStrategyFactory {
    private final MaximumSumSubArrayStrategy invalidMaximumSumSubArrayStrategy = new InvalidMaximumSumSubArrayStrategy();
    private final MaximumSumSubArrayStrategy validMaximumSumSubArrayStrategy = new ValidMaximumSumSubArrayStrategy();

    public MaximumSumSubArrayStrategy getStrategy(int[] input, int k) {
        if (input.length < k) {
            return invalidMaximumSumSubArrayStrategy;
        }
        if (input.length == 0 || k <= 0)
            return invalidMaximumSumSubArrayStrategy;

        return validMaximumSumSubArrayStrategy;
    }
}
