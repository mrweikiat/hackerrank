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
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);
        int ans = 2147483647; // proxy for first entry

        for (int i = 0; i < arr.size()-1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i+1)) < ans) {
                ans = Math.abs(arr.get(i) - arr.get(i+1));
            }
        }

        return ans;

    }

}

