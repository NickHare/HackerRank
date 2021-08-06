package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestCompareTheTriplets {
    @ParameterizedTest
    @MethodSource("testCompareTheTripletsProvider")
    public void testCompareTheTriplets(List<Integer> a, List<Integer> b, List<Integer> expectedResult){
        List<Integer> result = CompareTheTriplets.compareTriplets(a, b);
        Assertions.assertIterableEquals(expectedResult, result);
    }

    public static Stream<Arguments> testCompareTheTripletsProvider(){
        return Stream.of(
            Arguments.of(
                Arrays.asList(5, 6, 7),
                Arrays.asList(3, 6, 19),
                Arrays.asList(1, 1)
            ),
            Arguments.of(
                Arrays.asList(4, 5, 6),
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 0)
            )
        );
    }
}
