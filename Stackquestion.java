import java.lang.StackWalker.StackFrame;
import java.util.*;
import java.util.Stack;

public class Stackquestion {
    public static void pushAtBottom(int data, stackFrame<integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<integer> s = new java.util.Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pushAtBottom(4, s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
