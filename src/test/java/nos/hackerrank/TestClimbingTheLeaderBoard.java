package nos.hackerrank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestClimbingTheLeaderBoard {
    @ParameterizedTest
    @MethodSource("testClimbingTheLeaderBoardProvider")
    public void test(List<Integer> ranked, List<Integer> player, List<Integer> expectedResult){
        List<Integer> result = ClimbingTheLeaderBoard.climbingLeaderboard(ranked, player);
        Assertions.assertEquals(expectedResult, result);
    }

    public static Stream<Arguments> testClimbingTheLeaderBoardProvider(){
        return Stream.of(
            Arguments.of(
                Arrays.asList(100, 90, 90, 80),
                Arrays.asList(70, 80, 105),
                Arrays.asList(4,3,1)
            ),
            Arguments.of(
                Arrays.asList(100, 100, 50, 40, 40, 20, 10),
                Arrays.asList(5, 25, 50, 120),
                Arrays.asList(6, 4, 2, 1)
            ),
            Arguments.of(
                Arrays.asList(100, 90, 90, 80, 75, 60),
                Arrays.asList(50, 65, 77, 90, 102),
                Arrays.asList(6, 5, 4, 2, 1)
            )
        );
    }
}
