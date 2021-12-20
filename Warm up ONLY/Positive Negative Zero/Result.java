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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        int positive = 0;
        int negative = 0;
        int zero = 0;

        int arrLength = arr.size();

        for (int num : arr) {
            if (num == 0) {
                zero++;
            } else if (num > 0) {
                positive++;
            } else {
                negative++;
            }

        }

        double positiveRatio = (1.0 * positive) / arrLength;
        double negativeRatio = (1.0 * negative) / arrLength;
        double zeroRatio = (1.0 * zero ) / arrLength;

        DecimalFormat df = new DecimalFormat("#.######");
        df.setRoundingMode(RoundingMode.CEILING);

        System.out.println(df.format(positiveRatio));
        System.out.println(df.format(negativeRatio));
        System.out.println(df.format(zeroRatio));



    }

}

