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
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    // Write your code here

    int sizeOfB = brr.size();
    int sizeOfA = arr.size();

    int count = sizeOfB - sizeOfA;

    for (int i = 0; i < sizeOfA; i++) {
        brr.remove(arr.get(i));
    }

    Collections.sort(brr);

    List<Integer> ans = new ArrayList<>();

    for (int elem : brr) {
        if (!ans.contains(elem)) {
            ans.add(elem);
        }
    }

    return ans;

    }
}

