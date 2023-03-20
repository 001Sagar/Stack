import javax.xml.crypto.Data;
import java.util.*;

public class Basic {

    public class Stack {
        private int array[];
        private int topIndex;

        Stack() {
            array = new int[10];
            topIndex = -1;
        }

        public int size() {
            return topIndex + 1;
        }

        public void push(int elem) {
            if (topIndex == array.length - 1) {
                System.out.print("Stack is Full");
            }
            array[++topIndex] = elem;
        }

        public int top() {
            if (topIndex == -1) {
                System.out.println("Stack is Empty");
            }
            return array[topIndex];
        }

        public int pop() {
            if (topIndex == -1) {
                System.out.println("Stack is Empty");
            }
            int temp = array[topIndex];
            topIndex--;
            return temp;
        }

        public boolean isEmpty(int topIndex) {
            return topIndex == -1;
        }
    }

    public static void main(String[] args) {
        Stack newstack = new Stack();
        int array[] = { 1, 2, 3, 4, 5 };
        newstack.push(0);
        System.out.println(newstack);

    }
}
