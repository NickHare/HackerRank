package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestSimpleArraySum {
    @ParameterizedTest
    @MethodSource("testSimpleArraySumProvider")
    public void test(List<Integer> a, Integer expectedResult){
        Integer result = SimpleArraySum.simpleArraySum(a);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testSimpleArraySumProvider(){
        return Stream.of(
            Arguments.of(Arrays.asList(1, 2, 3, 4, 10, 11), 31),
            Arguments.of(Arrays.asList(5,4,3,7,8), 27)
        );
    }
}
