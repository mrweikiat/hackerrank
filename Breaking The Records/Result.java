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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        List<Integer> answer = new ArrayList<>();
        int currHighestRecord = scores.get(0);
        int currLowestRecord = scores.get(0);

        int mostRecord = 0;
        int leastRecord = 0;

        for (int score : scores) {
            if (score > currHighestRecord) {
                currHighestRecord = score;
                mostRecord++;
            } else if (score < currLowestRecord) {
                currLowestRecord = score;
                leastRecord++;
            }
        }

        answer.add(mostRecord);
        answer.add(leastRecord);

        return answer;

    }

}