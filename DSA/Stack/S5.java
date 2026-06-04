package DSA.Stack;

import java.util.Stack;

public class S5 {

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int target = 30;

        boolean found = false;

        for (Integer x : st) {

            if (x == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target Found");
        } else {
            System.out.println("Target Not Found");
        }
    }
}