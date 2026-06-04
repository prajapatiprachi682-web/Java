package DSA.Stack;

import java.util.Stack;

public class S2 {

    public static void main(String[] args) {

        String str = "Prachi";

        Stack<Character> st = new Stack<>();

        // for-each loop
        for (char ch : str.toCharArray()) {
            st.push(ch);
        }

        String rev = "";

        while (!st.isEmpty()) {
            rev += st.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);
    }
}