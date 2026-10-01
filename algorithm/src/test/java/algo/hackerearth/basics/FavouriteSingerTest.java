package algo.hackerearth.basics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FavouriteSingerTest {


    @ParameterizedTest
    @MethodSource("stringListData")
    void findFavoriteSinger(int expected, long[] songs) {
        assertEquals(expected,FavouriteSinger.findFavoriteSinger(songs));
    }

    static Stream<Arguments> stringListData(){
        return Stream.of(
                Arguments.of(
                        2,
                        new long[]{1,1,2,2,4}
                )
        );
    }
}