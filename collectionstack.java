import java.util.*;
import java.util.Stack;

public class collectionstack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // All operations
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // stack.push(40);
        // stack.push(50);
        // System.out.println(stack);
        // System.out.println(stack.peek());
        // System.err.println(stack.size());
        // System.out.println(stack.isEmpty());
        // System.err.println(stack.indexOf(30));
        // System.out.println(stack.toString());
        // System.out.println(stack.search(10));
        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}
