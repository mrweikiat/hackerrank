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
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        // Write your code here

        int size = s.length();
        int letter = 0; // even is S , odd is O
        int ans = 0;


        for (int i = 0; i < size; i++) {
            if (letter%2==0) {
                // here we should expect letter 'S'
                if (s.charAt(i) != 'S') {
                    ans++;
                    if (letter == 2) {
                        letter = 0;
                    } else {
                        letter++;
                    }
                } else {
                    if (letter == 2) {
                        letter = 0;
                    } else {
                        letter++;
                    }
                }

            } else {
                if (s.charAt(i) != 'O') {
                    ans++;
                }
                letter++;
            }
        }

        return ans;

    }

}
