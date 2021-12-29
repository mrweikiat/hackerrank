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
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here

    Collections.sort(arr);

    int ans = 2147483647;

    for (int i = 0; i <= arr.size()-k;i++) {
        int min = arr.get(i);
        int max = arr.get(i+k-1);

        if (max - min < ans) {
            ans = max - min;
        }
    }

    return ans;

    }

}

