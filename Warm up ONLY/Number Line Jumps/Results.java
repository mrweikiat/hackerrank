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
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here

        if (v2 > v1 || v2 == v1) {
            return "NO";
        } else {
            // confirm that v1 > v2

            int diff = x2 - x1;

            int stepGain = v1 - v2;

            // num of steps to catch up
            int numOfSteps = diff/stepGain;

            int pointX = x1 + (v1*numOfSteps);
            int pointY = x2 + (v2*numOfSteps);
            if (pointX == pointY) {
                return "YES";
            } else {
                return "NO";
            }

        }


    }

}
