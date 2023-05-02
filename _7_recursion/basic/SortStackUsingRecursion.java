package _7_recursion.basic;

import java.util.Arrays;
import java.util.Stack;

public class SortStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 10; i++)
            st.push((int) (Math.random() * 100));

        System.out.println(Arrays.toString(st.toArray()));
        Stack<Integer> s = sort(st);
        System.out.println(Arrays.toString(s.toArray()));

    }

    private static Stack<Integer> sort(Stack<Integer> s)
    {
        sortStack(s);
        return s;
    }

    private static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {

            int x = s.pop();

            sortStack(s);

            sortedInsert(s, x);
        }
    }

    private static void sortedInsert(Stack<Integer> s, int x) {
        if(s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }
}
