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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    // Write your code here
    int seaLevel = 0;
    int ans = 0;

    for (int i = 0; i < steps; i++) {

        char upDown = path.charAt(i);

        if (upDown == 'U') {
            if (seaLevel + 1 == 0) {
                ans++;
            }
            seaLevel++;
        } else {
            seaLevel--;
        }
    }

    return ans;

    }

}

