package nos.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonDivisibleSubset {
    /*
     * Complete the 'nonDivisibleSubset' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY s
     */

    public static int nonDivisibleSubset(int k, List<Integer> s) {
        List<Integer> remainders = new ArrayList<>();

        for (Integer n : s){
            remainders.add(n % k);
        }
        for (Integer n : remainders){

        }
        return 1;
    }
}
