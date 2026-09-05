package learn.algo.arrays.slidingWindow;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstrWithoutRepeatCharsTest {

    @ParameterizedTest
    @CsvSource({
            "3, abcabcbb",
            "1, bbbb",
            "3, pwwkew"
    })
    void lengthOfLongestSubstring(int expected, String s) {
        assertEquals(expected, new LongestSubstrWithoutRepeatChars().lengthOfLongestSubstring(s));
    }
}