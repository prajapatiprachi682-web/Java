package DSA.Stack;

import java.util.Stack;

public class S4 {

    public static void main(String[] args) {

        Stack<Integer> st1 = new Stack<>();

        st1.push(10);
        st1.push(20);
        st1.push(30);
        st1.push(40);
        st1.push(50);

        Stack<Integer> st2 = new Stack<>();

        // Copy st1 into st2
        for (Integer x : st1) {
            st2.push(x);
        }

        System.out.println("Stack 1 : " + st1);
        System.out.println("Stack 2 : " + st2);
    }
}