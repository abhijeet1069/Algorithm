package com.satyam.leetcode.arrays.fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class RemoveElementTest {

	@ParameterizedTest
    @MethodSource("testData")
	void testRemoveElement(int expected, int[] nums, int val) {
		assertEquals(expected, new RemoveElement().removeElement(nums,val));
		System.out.println(Arrays.toString(nums));
	}
	
	private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                		2,
                		new int[] {3,2,2,3},
                		3
                ),
                Arguments.of(
                		5,
                		new int[] {0,1,2,2,3,0,4,2},
                		2
                )
                
        );
    }
}
