package nos.hackerrank;

import java.math.BigInteger;

public class ExtraLongFactorials {
    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        String result = getExtraLongFactorials(n);
        System.out.println(result);
        return;
    }

    public static String getExtraLongFactorials(int n) {
        BigInteger result = new BigInteger("1");
        for (int i = 2; i <= n; i++){
            BigInteger factor = new BigInteger(String.valueOf(i));
            result = result.multiply(factor);
        }
        return result.toString();
    }
}
