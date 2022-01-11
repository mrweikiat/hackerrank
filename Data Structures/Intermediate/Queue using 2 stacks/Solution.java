import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        //System.out.println(queries);

        Stack<Integer> stk1 = new Stack<>(); // this will be the main stack
        Stack<Integer> stk2 = new Stack<>();

        for (int i = 0; i < queries; i++) {
            int action = sc.nextInt();
            if (action == 1) {
                int val = sc.nextInt();
                // put fresh values in stk1
                stk1.push(val);


            } else if (action == 2) {
                // since stk2 is the head of the q
                // if stk2 is empty we will populate it w fresh values
                // from stk1
                if (stk2.empty()) {
                    while(!stk1.empty()) {
                        stk2.push(stk1.pop());
                    }
                    stk2.pop();
                } else {
                    stk2.pop();
                }

            } else {

                if (stk2.empty()) {
                    while(!stk1.empty()) {
                        stk2.push(stk1.pop());
                    }
                    int toPrint = stk2.peek();
                    System.out.println(toPrint);
                } else {
                    int toPrint = stk2.peek();
                    System.out.println(toPrint);
                }

            }
        }



    }
}
