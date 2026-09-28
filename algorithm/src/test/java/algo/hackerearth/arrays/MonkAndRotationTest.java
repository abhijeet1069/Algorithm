package algo.hackerearth.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MonkAndRotationTest {

    @ParameterizedTest
    @MethodSource("stringListData")
    void rotateArray(int[] expected, int[] arr,int rotations) {
        assertArrayEquals(expected, MonkAndRotation.rotateArray(arr,rotations));
    }

    private static Stream<Arguments> stringListData(){
        return Stream.of(
                Arguments.of(
                        new int[] {4,5,1,2,3},
                        new int[] {1,2,3,4,5},
                        2
                )
        );
    }
}