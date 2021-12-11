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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    
    double denominator = arr.size();
    int positive = 0;
    int negative = 0;
    int zero = 0;
    
    
    for (int i = 0; i < arr.size(); i++) {
        if (arr.get(i).intValue() == 0) {
            zero += 1;
        } else if (arr.get(i).intValue() > 0) {
            positive += 1;
        } else {
            negative += 1;
        }
        
    }
    
    double ansPos = positive/ denominator;
    double ansNeg = negative/ denominator;
    double ansZero = zero/ denominator;
    
    DecimalFormat df = new DecimalFormat("#.000000");
    df.setRoundingMode(RoundingMode.CEILING);
    
    System.out.println( df.format(ansPos) );
    System.out.println( df.format(ansNeg));
    System.out.println( df.format(ansZero) );
    

    }

}

