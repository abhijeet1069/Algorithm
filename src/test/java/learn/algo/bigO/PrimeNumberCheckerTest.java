package learn.algo.bigO;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "true, 11",
            "true ,7",
            "false ,4",
    })
    void isPrime(boolean expected, int num) {
        assertEquals(expected,new PrimeNumberChecker().isPrime(num));
    }
}