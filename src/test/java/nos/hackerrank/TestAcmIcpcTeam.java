package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestAcmIcpcTeam {
    @ParameterizedTest
    @MethodSource("testAcmIcpcTeamProvider")
    public void test(List<String> topics, List<Integer> expectedResult){
        List<Integer> result = AcmIcpcTeam.acmTeam(topics);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testAcmIcpcTeamProvider(){
        return Stream.of(
            Arguments.of(Arrays.asList("10101", "11100", "11010", "00101"), Arrays.asList(5, 2)),
            Arguments.of(Arrays.asList("10101", "11110", "00010"), Arrays.asList(5, 1))
        );
    }
}
