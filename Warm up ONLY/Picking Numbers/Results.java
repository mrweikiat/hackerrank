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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here

        Collections.sort(a); // house keeping
        int ans = 0;
        int count = 1; // we get the first element so we add 1 to the count init()
        int curr = a.get(0);

        for (int i = 1; i < a.size(); i++) {
            if (Math.abs(curr - a.get(i)) <= 1) {
                count++;
            } else {
                if (count > ans) {
                    ans = count;
                    count = 1;
                    curr = a.get(i);
                } else {
                    count = 1;
                    curr = a.get(i);
                }
            }
        }

        // this is to address the boundary case where the whole arr is same number
        if (count > ans) {
            ans = count;
        }

        return ans;




    }

}

