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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here
    // use HashMap
    HashMap<Integer, List<Integer>> hm = new HashMap<>();

    for (int i = 0; i < arr.size(); i++) {
        int key = arr.get(i);
        int value = i+1;
        if (hm.containsKey(key)) {
            List<Integer> temp = hm.get(key);
            temp.add(value);
            hm.put(key, temp);
        } else {
            List<Integer> temp = new ArrayList<>();
            temp.add(value);
            hm.put(key, temp);
        }
    }

    List<Integer> soln = new ArrayList<>();
    boolean isFound = false;

    for (int i = 0; i < arr.size(); i++) {

        if (isFound) {
            break;
        }

        int toCheck = arr.get(i);
        if ((2*toCheck) == m) {
            List<Integer> temp = hm.get(toCheck);
            soln = hm.get(toCheck);
            System.out.println(soln.toString());
            isFound = true;
        } else {
            int partner = m - toCheck; // pair to check
            if (hm.containsKey(partner)) {
                List<Integer> temp = new ArrayList<>();
                temp.add(hm.get(toCheck).get(0));
                temp.add(hm.get(partner).get(0));
                //Collections.sort(temp);
                soln = temp;
                System.out.println(soln.toString());
                isFound = true;
            }
        }
    }


    return soln;


    }

}
