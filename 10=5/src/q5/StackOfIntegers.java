package q5;

import java.util.Stack;

public class StackOfIntegers {
    
    
    
    private Stack<Integer> stack;

    public StackOfIntegers() {
        this.stack = new Stack<>();
    }

    public void push(int item) {
        stack.push(item);
    }

    public int pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        while (!isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}