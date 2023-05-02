package _7_recursion.basic;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 10; i++)
            st.push(i+1);

        System.out.println(Arrays.toString(st.toArray()));

        reverse(st);

        System.out.println(Arrays.toString(st.toArray()));
    }

    private static void reverse(Stack<Integer> s)
    {
        if(s.isEmpty()) return;

        int top = s.pop();
        reverse(s);
        insertAtBottom(s, top);
    }

    private static void insertAtBottom(Stack<Integer> s, int x) {
        if(s.isEmpty()) {
            s.push(x);
            return;
        }

        int top = s.pop();
        insertAtBottom(s, x);
        s.push(top);
    }
}

// https://practice.geeksforgeeks.org/problems/reverse-a-stack/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=reverse-a-stack
