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
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static String balancedSums(List<Integer> arr) {
    // Write your code here

    if (arr.size() == 1 ) {
        return "YES";
    } else {
        int totalSum = 0;

        // find the sum of all the elements first
        for (int i = 0; i < arr.size(); i++) {
            totalSum += arr.get(i);
        }

        int left = totalSum;
        int right = 0;

        // before we hit the element of concern, the right will always be lower than left

        for (int i = 0; i < arr.size(); i++) {
            if (right + arr.get(i) == left) {
                return "YES";
            } else if (right > left) {
                return "NO";
            } else {
                right += arr.get(i);
                left -= arr.get(i);
            }
        }

        return "NO";
        }
    }
}

