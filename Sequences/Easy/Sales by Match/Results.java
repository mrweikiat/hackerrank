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
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        Collections.sort(ar);
        int ans = 0;

        for (int i = 0; i < ar.size()-1; i++) {
            if (ar.get(i) == ar.get(i+1)) {
                ar.set(i, -1);
                ar.set(i+1, -1);
                ans++;
            }
        }


        return ans;

    }

}

