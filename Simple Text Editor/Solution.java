import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner input = new Scanner(System.in);
        String s = ""; // empty string init
        // use a stack to hold the cache of op 1 and 2
        Stack<String> cache = new Stack<>();  
        List<Character> ans = new ArrayList<>();
        
        
        int numOfOps = input.nextInt();
        
        for (int i = 0; i < numOfOps; i++) {
            
            String type = input.next();
            
            if (type.equals("1")) {
                cache.push(s);
                String w = input.next();
                String holder = concat(s,w);
                s = holder;
                
                
            } else if (type.equals("2")) {
                cache.push(s);
                int numToDel = input.nextInt();
                int strSize = s.length();
                s = s.substring(0,strSize - numToDel);
        
                
            } else if (type.equals("3")) {
                int charPos = input.nextInt();
                char toPrint = s.charAt(charPos-1);
                ans.add(toPrint);
                //System.out.println(toPrint);
                
            } else {
                // type 4 undo()
                
                String holder = cache.pop();
                s = holder;
                
            }
            
        }
        
        for (char a : ans) {
            System.out.println(a);
        }
      
    }
    
    public static String concat(String s1, String s2) {
        return new StringBuilder(s1).append(s2).toString();
    }
}