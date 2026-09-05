package learn.algo.arrays.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MaxAvgSubaray1Test {

    @ParameterizedTest
    @MethodSource("testData")
    void findMaxAverage(double expected,int[] nums, int k) {
        assertEquals(expected, new MaxAvgSubaray1().findMaxAverage(nums,k),0.00001);
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        12.75,
                        new int[] {1,12,-5,-6,50,3},
                        4
                ),
                Arguments.of(
                        5.00,
                        new int[] {5},
                        1
                )
        );
    }
}