package com.satyam.arrays.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PivotIndexTest {

    @ParameterizedTest
    @MethodSource("testData")
    void pivotIndex(int expected, int[] nums) {
        assertEquals(expected, new PivotIndex().pivotIndex(nums));
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        3,
                        new int[] {1,7,3,6,5,6}
                ),
                Arguments.of(
                        -1,
                        new int[] {1,2,3}
                ),
                Arguments.of(
                        0,
                        new int[] {2,1,-1}
                )
        );
    }
}