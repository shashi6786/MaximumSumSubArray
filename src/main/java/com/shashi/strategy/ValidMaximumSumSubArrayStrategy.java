package com.shashi.strategy;

public class ValidMaximumSumSubArrayStrategy implements MaximumSumSubArrayStrategy {
    @Override
    public String findMaximumSumSubArray(int[] input, int k) {
        long maximumSum = findMaximumSumBySlidingWindow(input, k);
        return String.valueOf(maximumSum);
    }

    private long findMaximumSumBySlidingWindow(int[] input, int k) {
        long windowSum = 0;
        long maximumSum = 0;
        int windowStart = 0;
        int windowEnd = 0;
        while (windowEnd < input.length) {
            windowSum += input[windowEnd]; // add the next element to the windowSum
            // windowStart needs to be moved only when the sub array size 'k' has reached already
            if (windowEnd >= k - 1) {
                maximumSum = Math.max(maximumSum, windowSum);
                windowSum -= input[windowStart]; // remove the element going out
                windowStart++; // move the window ahead
            }
            windowEnd++; // otherwise keep extending the window till sub array size 'k'
        }
        return maximumSum;
    }
}
