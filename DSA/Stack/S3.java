package DSA.Stack;

import java.util.Stack;

public class S3 {

    public static void main(String[] args) {

        String str = "madam";

        Stack<Character> st = new Stack<>();

        // Push all characters
        for (char ch : str.toCharArray()) {
            st.push(ch);
        }

        String rev = "";

        // Reverse string using stack
        while (!st.isEmpty()) {
            rev += st.pop();
        }

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + rev);

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}