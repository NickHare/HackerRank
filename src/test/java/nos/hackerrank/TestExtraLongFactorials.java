package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestExtraLongFactorials {
    @ParameterizedTest
    @MethodSource("testExtraLongFactorialsProvider")
    public void test(int n, String expectedResult){
        String result = ExtraLongFactorials.getExtraLongFactorials(n);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testExtraLongFactorialsProvider(){
        return Stream.of(
            Arguments.of(0, "1"),
            Arguments.of(1, "1"),
            Arguments.of(2, "2"),
            Arguments.of(3, "6"),
            Arguments.of(25, "15511210043330985984000000"),
            Arguments.of(30, "265252859812191058636308480000000")
        );
    }
}
