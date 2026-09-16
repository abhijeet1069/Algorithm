package learn.algo.bigO;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @ParameterizedTest
    @MethodSource("testData")
    void reverse(int[] expected, int[] input) {
        new ReverseArray().reverse(input);
        assertArrayEquals(expected,input);
    }

    static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        new int[]{1,2,3,4,5},
                        new int[]{5,4,3,2,1}
                )
        );
    }
}