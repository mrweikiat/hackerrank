import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here

        int ans = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int toCheck = ar.get(i) + ar.get(j);
                if (toCheck%k == 0) {
                    ans++;
                }
            }


        }

        return ans;

    }

}