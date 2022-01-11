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
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong

    boolean isLongEnough = false;
    boolean hasDigit = false;
    boolean hasLowerCase = false;
    boolean hasUpperCase = false;
    boolean hasSpecialCase = false;

    int ans = 0;
    int passwordLength = password.length();

    for (int i = 0; i < password.length(); i++) {
        int toCheck = password.charAt(i);
        //System.out.println(toCheck);
        // ascii for numerics is 48 - 57
        // ascii for lower case is 97 - 122
        // ascii for upper case is 65 - 90
        // special char is 33 - 64
        if (toCheck >= 48 && toCheck <= 57) {
            hasDigit = true;
        } else if (toCheck >= 33 && toCheck <= 64) {
            hasSpecialCase = true;
        } else if (toCheck >= 65 && toCheck <= 90) {
            hasUpperCase = true;
        } else if (toCheck >= 97 && toCheck <= 122) {
            hasLowerCase = true;
        }
    }

    if (!hasDigit) {
        ans++;
        passwordLength++;
    }
    if (!hasSpecialCase) {
        ans++;
        passwordLength++;
    }
    if (!hasUpperCase) {
        ans++;
        passwordLength++;
    }
    if (!hasLowerCase) {
        ans++;
        passwordLength++;
    }
    if (passwordLength < 6) {
        ans += 6 - passwordLength;
    }

    return ans;


    }

}

