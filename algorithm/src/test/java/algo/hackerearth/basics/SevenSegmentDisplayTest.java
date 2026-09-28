package algo.hackerearth.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2",
            "7, 3",
            "11, 4",
            "7111, 9"
    })
    void getTotalMatchSticks(String expectedMaxNum, int matchSticks) {
        assertEquals(expectedMaxNum, new SevenSegmentDisplay().getMaxFromMatchSticks(matchSticks));
    }

    @ParameterizedTest
    @CsvSource({
            "6, 0",
            "12, 123",
            "15, 456",
            "21, 12345",
            "18, 999",
            "20, 2024"
    })
    void getMaxNumFromMatchSticks(int expectedMaxNum, String num) {
        assertEquals(expectedMaxNum, new SevenSegmentDisplay().getTotalMatchSticks(num));
    }
}