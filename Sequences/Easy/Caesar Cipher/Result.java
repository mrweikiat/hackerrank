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
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
    // 26 alphabets

    // find out if got more than 1 rotations
    int rotations = k % 26;
    String ans = "";

    // 65 to 90
    // 97 to 122

    for (int i = 0; i < s.length(); i++) {
        int temp = s.charAt(i);
        if (temp <= 90 && temp >= 65) {
            if (temp + rotations > 90) {
                int leftOver = (temp + rotations) - 90;
                int toAddInt = 64 + leftOver;
                char toAdd = (char)toAddInt;
                ans += toAdd;
            } else {
                temp += rotations;
                char toAdd = (char)temp;
                ans += toAdd;
            }
        } else if (temp <= 122 && temp >= 97) {
            if (temp + rotations > 122) {
                int leftOver = (temp + rotations) - 122;
                int toAddInt = 96 + leftOver;
                char toAdd = (char)toAddInt;
                ans += toAdd;
            } else {
                temp += rotations;
                char toAdd = (char)temp;
                ans += toAdd;
            }
        } else {
            ans += s.charAt(i);
        }
    }
    return ans;

    }

}

