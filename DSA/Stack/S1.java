package DSA.Stack;

import java.util.*;

public class S1 {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        System.out.println(st);
        System.out.println("Removed Value: + st.pop()");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}
