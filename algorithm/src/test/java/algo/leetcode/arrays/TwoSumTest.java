package algo.leetcode.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @ParameterizedTest
    @MethodSource("stringListData")
    void twoSum(int[] expected, int[] nums, int target) {
        assertArrayEquals(expected, new TwoSum().twoSum(nums,target));
    }

    private static Stream<Arguments> stringListData(){
        return Stream.of(
                Arguments.of(
                        new int[] {1,0},
                        new int[] {2,7,11,15},
                        9
                ),
                Arguments.of(
                        new int[] {2,1},
                        new int[] {3,2,4},
                        6
                )
        );
    }
}