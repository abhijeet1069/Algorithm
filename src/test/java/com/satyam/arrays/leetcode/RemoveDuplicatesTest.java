package com.satyam.arrays.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveDuplicatesTest {

	@ParameterizedTest
    @MethodSource("testData")
	void testRemoveDuplicates(int[] nums, int expected) {
		assertEquals(expected, new RemoveDuplicates().removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));
	}
	
	private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                		new int[] {1,1,2},
                		2
                ),
                Arguments.of(
                		new int[] {0,0,1,1,1,2,2,3,3,4},
                		5
                )
                
        );
    }
}
