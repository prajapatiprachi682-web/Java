package DSA.Stack;

import java.util.Stack;

public class S6 {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(50);
        st.push(20);
        st.push(5);
        st.push(30);

        int min = st.peek();
        int max = st.peek();

        for (Integer x : st) {

            if (x < min) {
                min = x;
            }

            if (x > max) {
                max = x;
            }
        }

        System.out.println("Stack : " + st);
        System.out.println("Minimum Value : " + min);
        System.out.println("Maximum Value : " + max);
    }
}