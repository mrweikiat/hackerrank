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
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here

    int size = 100;
    List<Integer> countingSort = new ArrayList<>();

    for (int i = 0; i < size; i++) {
        countingSort.add(0);
    }

    for (int element : arr) {
        int currCount = countingSort.get(element);
        countingSort.set(element, currCount+1);
    }

    return countingSort;

    }

}
