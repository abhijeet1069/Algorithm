package com.satyam.leetcode.arrays.twoPointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @ParameterizedTest
    @MethodSource("testData")
    void isPalindrome(boolean expected, String s) {
        assertEquals(expected, new ValidPalindrome().isPalindrome(s));
    }

    static Stream<Arguments> testData(){
        return Stream.of(
                Arguments.of(
                        true,
                        "A man, a plan, a canal: Panama"
                ),
                Arguments.of(
                        false,
                        "race a car"
                ),
                Arguments.of(
                        true,
                        " "
                )
        );
    }
}