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
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here

    boolean isSorted = true;

    for (int i = 0; i < grid.size(); i++) {
        char[] temp = grid.get(i).toCharArray();
        Arrays.sort(temp);
        grid.set(i, String.valueOf(temp));
        //System.out.println(grid.get(i));
    }

    for (int i = 0; i < grid.get(0).length(); i++) {

        if (!isSorted) {
            break;
        }

        int ch = grid.get(0).charAt(i);
        for (int j = 1; j < grid.size(); j++) {
            int chToCheck = grid.get(j).charAt(i);
            if (ch > chToCheck) {
                isSorted = false;
                break;
            }
        }
    }

    if (isSorted) {
        return "YES";
    } else {
        return "NO";
    }

    }

}
