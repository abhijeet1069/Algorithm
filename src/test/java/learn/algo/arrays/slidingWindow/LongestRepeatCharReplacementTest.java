package learn.algo.arrays.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatCharReplacementTest {

    @ParameterizedTest
    @CsvSource({
            "4, ABAB, 2",
            "4, AABABBA, 1",
    })
    void characterReplacement(int expected, String s, int k) {
        assertEquals(expected, new LongestRepeatCharReplacement().characterReplacement(s,k));
    }
}