package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestNonDivisibleSubset {
    @ParameterizedTest
    @MethodSource("testProvider")
    public void test(Integer k, List<Integer> s, Integer expectedResult){
        Integer result = NonDivisibleSubset.nonDivisibleSubset(k, s);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testProvider(){
        return Stream.of(
            Arguments.of(3, Arrays.asList(1, 7, 2, 4), 3)
//            Arguments.of(2, 2)
        );
    }
}
