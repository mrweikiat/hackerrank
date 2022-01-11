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
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here

        int size = s.size();
        int ans = 0;

        for (int i = 0; i < size; i++) {
            int toCheck = 0;
            for (int j = i; j < i+m; j++) {
                if (j < size) {
                    toCheck += s.get(j);
                }
            }
            if (toCheck == d) {
                ans++;
            }
        }

        return ans;

    }

}

