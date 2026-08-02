package com.satyam.arrays.leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStockTest {

    @ParameterizedTest
    @MethodSource("testData")
    void pivotIndex(int expected, int[] nums) {
        assertEquals(expected, new BestTimeToBuySellStock().maxProfit(nums));
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        5,
                        new int[] {7,1,5,3,6,4}
                ),
                Arguments.of(
                        0,
                        new int[] {7,6,4,3,1}
                )
        );
    }

}