package nos.hackerrank;

import java.util.*;

class CompareTheTriplets {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int aPoints = 0;
        int bPoints = 0;
        int index = 0;

        while (index < a.size() && index < b.size()){
            if (a.get(index) > b.get(index)){
                aPoints++;
            } else if (a.get(index) < b.get(index)){
                bPoints++;
            }
            index++;
        }

        return Arrays.asList(aPoints, bPoints);
    }

}
