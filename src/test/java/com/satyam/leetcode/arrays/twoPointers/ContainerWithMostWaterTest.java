package com.satyam.leetcode.arrays.twoPointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @ParameterizedTest
    @MethodSource("testData")
    void testMaxArea(int expected, int[] height) {
        assertEquals(expected, new ContainerWithMostWater().maxArea(height));
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        49,
                        new int[]{1,8,6,2,5,4,8,3,7}
                ),
                Arguments.of(
                        1,
                        new int[]{1,1}
                )
        );
    }
}