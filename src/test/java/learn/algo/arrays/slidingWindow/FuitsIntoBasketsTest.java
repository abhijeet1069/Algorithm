package learn.algo.arrays.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FuitsIntoBasketsTest {

    @ParameterizedTest
    @MethodSource("testData")
    void totalFruit(int expected, int[] fruits) {
        assertEquals(expected, new FuitsIntoBaskets().totalFruit(fruits));
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        3,
                        new int[] {1,2,1}
                ),
                Arguments.of(
                        3,
                        new int[] {0,1,2,2}
                ),
                Arguments.of(
                        4,
                        new int[] {1,2,3,2,2}
                ),
                Arguments.of(
                        5,
                        new int[] {3,3,3,1,2,1,1,2,3,3,4}
                )
        );
    }
}