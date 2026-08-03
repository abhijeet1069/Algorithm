package com.satyam.leetcode.arrays.twoPointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    @ParameterizedTest
    @MethodSource("testData")
    void testMoveZeroes(int[] expected, int[] nums) {
        new MoveZeroes().moveZeroes(nums);
        assertArrayEquals(expected, nums);
    }

    static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        new int[] {1,3,12,0,0},
                        new int[]{0,1,0,3,12}
                ),
                Arguments.of(
                        new int[] {0},
                        new int[]{0}
                )
        );
    }
}