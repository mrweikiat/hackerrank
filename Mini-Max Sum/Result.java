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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        // sort the list using bubble


        for (int i = 0; i < arr.size()-1; i++) {
            for (int j = 0; j < arr.size()-1-i;j++) {
                if (arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
        }

        //System.out.println(Arrays.toString(arr.toArray()));

        // might overflow due to the constraints so might need to add to as long
        // add smallest first
        long smallest = 0L;
        long maximum = 0L;
        for (int i = 0; i < arr.size()-1;i++) {
            smallest += arr.get(i);
        }
        for (int i = 1; i < arr.size();i++) {
            maximum += arr.get(i);
        }

        System.out.println(smallest + " " + maximum);

    }

}