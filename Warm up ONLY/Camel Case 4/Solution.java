import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {

            String input = sc.nextLine();
            char op = input.charAt(0);
            char type = input.charAt(2);
            String name = input.substring(4);

            if (op == 'S') {

                if (type =='M') {

                    splitMethod(name);

                } else if (type == 'C') {

                    splitClass(name);

                } else {

                    splitVariable(name);

                }
            } else {
                // type C

                if (type == 'M') {

                    createMethod(name);

                } else if (type == 'C') {

                    createClass(name);

                } else {

                    createVariable(name);

                }
            }
        }
        sc.close();


    }

    public static String buildString(String str1, String str2) {
        return new StringBuilder(str1).append(str2).toString();
    }

    public static void splitMethod(String name) {
        name = name.substring(0, name.length()-2);

        String[] camelCaseWords = name.split("(?=[A-Z])");
        String ans = "";
        ans = camelCaseWords[0];

        for (int i = 1; i < camelCaseWords.length; i++) {
            String str = " " + camelCaseWords[i].toLowerCase();
            ans = buildString(ans, str);
        }

        System.out.println(ans);
    }

    public static void splitClass(String name) {

        String[] camelCaseWords = name.split("(?=[A-Z])");

        String ans = camelCaseWords[0].toLowerCase();

        for (int i = 1; i < camelCaseWords.length; i++) {
            String str = " " + camelCaseWords[i].toLowerCase();
            ans = buildString(ans, str);
        }

        System.out.println(ans);

    }

    public static void splitVariable(String name) {
        String[] camelCaseWords = name.split("(?=[A-Z])");
        String ans = "";
        ans = camelCaseWords[0];

        for (int i = 1; i < camelCaseWords.length; i++) {
            String str = " " + camelCaseWords[i].toLowerCase();
            ans = buildString(ans, str);
        }

        System.out.println(ans);
    }

    public static void createMethod(String name) {
        String[] camelCaseWords = name.split(" ");
        String ans = camelCaseWords[0];

        for (int i = 1; i < camelCaseWords.length; i++) {
            String str = camelCaseWords[i].substring(0,1).toUpperCase() + camelCaseWords[i].substring(1);
            ans = buildString(ans, str);
        }

        ans = buildString(ans, "()");
        System.out.println(ans);
    }

    public static void createClass(String name) {
        String[] camelCaseWords = name.split(" ");
        String ans = camelCaseWords[0].substring(0,1).toUpperCase() + camelCaseWords[0].substring(1);

        for (int i = 1; i < camelCaseWords.length; i++) {
            String str = camelCaseWords[i].substring(0,1).toUpperCase() + camelCaseWords[i].substring(1);
            ans = buildString(ans, str);
        }

        System.out.println(ans);
    }

    public static void createVariable(String name) {
        String[] camelCaseWords = name.split(" ");
        String ans = camelCaseWords[0];

        for (int i = 1; i < camelCaseWords.length; i++) {
            String str = camelCaseWords[i].substring(0, 1).toUpperCase() + camelCaseWords[i].substring(1);
            ans = buildString(ans, str);
        }

        System.out.println(ans);

    }
}