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
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // Write your code here

        List<Integer> ans = new ArrayList<>();
        List<Integer> clearAll = new ArrayList<>();

        for (String query : queries) {
            int holder = 0;
            for (String string : strings) {
                if (query.equals(string)) {
                    holder++;
                }
            }
            ans.add(holder);
        }


        return ans;
    }

}
