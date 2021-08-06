package nos.hackerrank;

import java.util.List;

public class SimpleArraySum {
    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (Integer n : ar){
            sum += n;
        }
        return sum;
    }
}
