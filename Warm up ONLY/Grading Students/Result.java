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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here

        int size = grades.size();

        for (int i = 0; i < size; i++) {
            int grade = grades.get(i);
            if (grade > 37) {
                if (grade%5 != 0) {
                    //not multiple of 5
                    int nextMultipleOfFive = ((grade/5) + 1)*5;
                    if (nextMultipleOfFive - grade < 3) {
                        grades.set(i, nextMultipleOfFive);
                    }
                }
            }
        }

        return grades;


    }

}

