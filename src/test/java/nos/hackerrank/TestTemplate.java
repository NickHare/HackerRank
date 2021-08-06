package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class TestTemplate {
    @ParameterizedTest
    @MethodSource("testProvider")
    public void test(Integer a, Integer expectedResult){
        Integer result = a;
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testProvider(){
        return Stream.of(
            Arguments.of(1, 1),
            Arguments.of(2, 2)
        );
    }
}
