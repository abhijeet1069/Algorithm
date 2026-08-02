package com.satyam.arrays.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    @ParameterizedTest
    @MethodSource("testData")
    void merge(int[] expected, int[] nums1, int m, int[] nums2, int n) {
        new MergeSortedArrays().merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        new int[] {1,2,2,3,5,6},
                        new int[] {1,2,3,0,0,0},
                        3,
                        new int[] {2,5,6},
                        3
                ),
                Arguments.of(
                        new int[] {1},
                        new int[] {1},
                        1,
                        new int[] {},
                        0
                )
        );
    }
}