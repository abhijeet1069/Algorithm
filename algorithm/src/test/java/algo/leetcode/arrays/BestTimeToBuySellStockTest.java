package algo.leetcode.arrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuySellStockTest {

    @ParameterizedTest
    @MethodSource("stringListData")
    void maxProfit() {

    }

    private static Stream<Arguments> stringListData(){
        return Stream.of(
                Arguments.of(
                        5,
                        new int[] {7,1,5,3,6,4}
                ),
                Arguments.of(
                        new int[] {2,1},
                        new int[] {3,2,4},
                        6
                )
        );
    }
}