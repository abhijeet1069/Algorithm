package com.satyam.leetcode.arrays.twoPointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSum2InputArraySortedTest {

    @ParameterizedTest
    @MethodSource("testData")
    void twoSum(int[] expected, int[] numbers, int target) {
        assertArrayEquals(expected, new TwoSum2InputArraySorted().twoSum(numbers,target));
    }

    static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        new int[]{1,2},
                        new int[]{2,7,11,15},
                        9
                ),
                Arguments.of(
                        new int[]{1,3},
                        new int[]{2,3,4},
                        6
                ),
                Arguments.of(
                        new int[]{1,2},
                        new int[]{-1,0},
                        -1
                )
        );
    }
}