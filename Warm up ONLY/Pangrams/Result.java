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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here

    // 97 to 122
    // 65 to 90

    int lower = 97;
    int upper = 65;

    boolean isPangram = true;

    for (int i = 0; i<26; i++) {
        char lowerCase = (char)lower;
        char upperCase = (char)upper;

        if (s.contains(String.valueOf(lowerCase)) || s.contains(String.valueOf(upperCase))) {

        } else {
            isPangram = false;
        }
        lower++;
        upper++;

    }

    if (isPangram) {
        return "pangram";
    } else {
        return "not pangram";
    }

    }

}

