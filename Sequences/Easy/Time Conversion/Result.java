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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String ans = "";

        if (s.contains("PM")) {
            String hour = s.substring(0,2);
            String minSec = s.substring(2,8);
            if (hour.contains("12")) {
                ans = hour + minSec;
            } else {
                int hourInInt = Integer.parseInt(hour);
                hourInInt += 12;
                hour = String.valueOf(hourInInt);
                ans = hour + minSec;
            }
        } else {
            // use case for "AM"
            String hour = s.substring(0,2);
            String minSec = s.substring(2,8);
            //System.out.println(hour);
            //System.out.println(minSec);
            if (hour.contains("12")) {
                hour = "00";
                ans = hour + minSec;
            } else {
                ans = hour + minSec;
            }

        }

        return ans;

    }

}