package nos.hackerrank;

import java.util.List;
import java.util.ArrayList;

public class ClimbingTheLeaderBoard {
    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>(player.size());
        int rIndex = 0;
        int pIndex = 0;
        int rankedScore = (ranked.size() > 0)? ranked.get(0) : 0;
        int playerScore = 0;
        int rank = 1;

        for (pIndex = player.size() - 1; pIndex >= 0; pIndex--){
            playerScore = player.get(pIndex);
            while (rIndex < ranked.size() && playerScore < rankedScore){
                rIndex++;
                if (rIndex == ranked.size() || ranked.get(rIndex) < rankedScore){
                    rank++;
                    rankedScore = (rIndex < ranked.size())? ranked.get(rIndex) : 0;
                }
            }
            result.add(0, rank);
        }
        return result;
    }
}
