package com.satyam.arrays.leetcode;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumTest {

	@ParameterizedTest
    @MethodSource("testData")
	void testTwoSum(int[] expected, int[] nums, int target) {
		assertArrayEquals(expected, new TwoSum().twoSum(nums, target));
	}
	
	private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                		new int[] {0,1},
                		new int[] {2,7,11,15},
                		9
                ),
                Arguments.of(
                		new int[] {1,2},
                		new int[] {3,2,4},
                		6
                ),
                Arguments.of(
                		new int[] {0,1},
                		new int[] {3,3},
                		6
                )
                
        );
    }

}
