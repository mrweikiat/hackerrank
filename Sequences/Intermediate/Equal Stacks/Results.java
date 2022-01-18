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
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here

        int sumH1 = 0;
        int sumH2 = 0;
        int sumH3 = 0;
        int ptr1 = 0;
        int ptr2 = 0;
        int ptr3 = 0;

        for (int elem : h1) {
            sumH1 += elem;
        }
        for (int elem : h2) {
            sumH2 += elem;
        }

        for (int elem : h3) {
            sumH3 += elem;
        }

        if (sumH1 == sumH2 && sumH2 == sumH3) {
            return sumH1;
        }

        while (sumH1 != 0 && sumH2 != 0 && sumH3 != 0) {
            int largest = Math.max(sumH1, Math.max(sumH2, sumH3));

            if (sumH1 == largest) {
                sumH1 -= h1.get(ptr1);
                ptr1++;
            }

            if (sumH2 == largest) {
                sumH2 -= h2.get(ptr2);
                ptr2++;
            }

            if (sumH3 == largest) {
                sumH3 -= h3.get(ptr3);
                ptr3++;
            }

            if (sumH1 == sumH2 && sumH2 == sumH3) {
                return sumH1;
            }
        }

        return 0;
    }
}
