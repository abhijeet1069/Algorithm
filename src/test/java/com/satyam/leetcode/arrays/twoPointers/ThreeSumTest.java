package com.satyam.leetcode.arrays.twoPointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @ParameterizedTest
    @MethodSource("testData")
    void threeSumTest(List<List<Integer>> expected, int[] nums) {
        assertEquals(expected, new ThreeSum().threeSum(nums));
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(Arrays.asList(
                        Arrays.asList(-1,-1,2), Arrays.asList(-1,0,1)),
                        new int[]{-1,0,1,2,-1,-4}
                ),
                Arguments.of(Arrays.asList(), new int[]{0,1,1})
        );
    }
}