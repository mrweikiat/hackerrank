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
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
        // Write your code here
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());
        for(int i = 0; i < A.size(); i++){
            int temp = A.get(i)+B.get(i);
            if(temp < k){
                return "NO";
            }
        }
        return "YES";

    }

}

