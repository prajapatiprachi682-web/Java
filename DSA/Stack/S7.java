package DSA.Stack;

import java.util.Stack;

public class S7 {

    static void insertAtBottom(Stack<Integer> st, int x) {

        if (st.isEmpty()) {
            st.push(x);
            return;
        }

        int top = st.pop();

        insertAtBottom(st, x);

        st.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Before : " + st);

        insertAtBottom(st, 5);

        System.out.println("After  : " + st);
    }
}