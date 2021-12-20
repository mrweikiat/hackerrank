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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int size = arr.size();
        //System.out.println(size);
        int leftToRight = 0;
        int rightToLeft = 0;


        for (int i = 0; i < size; i++) {
            leftToRight += arr.get(i).get(i);
        }
        //System.out.println(leftToRight);

        for (int i = size-1; i >= 0; i--) {
            rightToLeft += arr.get(i).get(size-i-1);
        }

        //System.out.println(rightToLeft);



        return Math.abs(leftToRight - rightToLeft);
    }

}

