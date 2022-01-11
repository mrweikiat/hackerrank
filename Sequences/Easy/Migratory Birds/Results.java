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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here

        Collections.sort(arr);
        int ans = 2147483647;
        int ansCount = 0;

        int count = 1;
        int curr = arr.get(0);


        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) == curr) {
                count++;
            } else {
                if (count > ansCount) {
                    ansCount = count;
                    ans = curr;
                    count = 1;
                    curr = arr.get(i);
                } else {
                    count = 1;
                    if (i < arr.size()-1) {
                        curr = arr.get(i+1);
                    }

                }
            }
        }

        if (count > ansCount) {
            ansCount = count;
            ans = curr;
        }


        return ans;
    }

}
