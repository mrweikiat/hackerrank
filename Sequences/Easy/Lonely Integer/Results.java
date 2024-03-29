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
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here

        int size = a.size();
        int toReturn = 0;
        boolean isBreak = false;

        for (int i = 0; i < size; i++) {
            int toCheck = a.get(i);
            boolean hasDuplicate = false;

            if (toCheck >= 0) {
                for (int j = i+1; j < size; j++) {
                    if (toCheck == a.get(j)) {
                        hasDuplicate = true;
                        a.set(j, -1);
                        break;
                    }
                }
                if (!hasDuplicate) {
                    toReturn = toCheck;
                    break;
                }
            }


        }


        return toReturn;

    }

}

