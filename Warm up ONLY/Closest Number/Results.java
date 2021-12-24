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
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);

        List<Integer> ans = new ArrayList<>();

        int minDiff = 2147483647; // proxy for first pair

        for (int i = 0; i < arr.size()-1; i++) {
            if (Math.abs(arr.get(i) - arr.get(i+1)) < minDiff) {
                // clear all content and add this new pair in
                minDiff = Math.abs(arr.get(i) - arr.get(i+1));
                ans.clear();
                ans.add(arr.get(i));
                ans.add(arr.get(i+1));
            } else if (Math.abs(arr.get(i) - arr.get(i+1)) == minDiff) {
                ans.add(arr.get(i));
                ans.add(arr.get(i+1));
            } else {
                // diff more than minDiff, nothing happens?!

            }
        }



        return ans;



    }

}
