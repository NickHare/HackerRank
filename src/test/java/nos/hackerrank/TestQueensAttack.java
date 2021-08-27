package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestQueensAttack {
    @ParameterizedTest
    @MethodSource("testQueensAttackProvider")
    public void test(Integer n, Integer k, Integer r_q, Integer c_q, List<List<Integer>> obstacles, Integer expectedResult){
        Integer result = QueensAttack.queensAttack(n, k, r_q, c_q, obstacles);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testQueensAttackProvider(){
        return Stream.of(
            Arguments.of(4, 0, 4, 4, Arrays.asList(), 9),
            Arguments.of(5, 3, 4, 3, Arrays.asList(Arrays.asList(5, 5), Arrays.asList(4, 2), Arrays.asList(2, 3)), 10),
            Arguments.of(100000, 0, 4187, 5068, Arrays.asList(), 308369)
        );
    }
}
