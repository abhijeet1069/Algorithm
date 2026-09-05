package learn.algo.arrays.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MinWindowSubstrTest {

    @ParameterizedTest
    @CsvSource({
            "BANC, ADOBECODEBANC, ABC",
            "a, a, a",
    })
    void minWindow(String expected, String s, String t) {
        assertEquals(expected, new MinWindowSubstr().minWindow(s,t));
    }
}