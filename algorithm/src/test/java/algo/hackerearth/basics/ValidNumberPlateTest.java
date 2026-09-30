package algo.hackerearth.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidNumberPlateTest {

    @ParameterizedTest
    @CsvSource({
            "false, 12X345-67",
            "true, 13X357-22"
    })
    void isValidNumberPlate(boolean expected, String num) {
        assertEquals(expected,ValidNumberPlate.isValidNumberPlate(num));
    }
}