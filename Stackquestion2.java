import java.lang.StackWalker.StackFrame;
import java.util.*;
import java.util.Stack;

import javax.swing.plaf.nimbus.State;
import javax.swing.undo.StateEdit;

public class Stackquestion2 {
    public static void pushAtBottom(int data, stackFrame<integer> s) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void reverse(java.util.Stack<integer> s) {
        if (s.isEmpty()) {
            return;
        }
        integer top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }

    private static void pushAtBottom(integer top, java.util.Stack<integer> s) {
    }

    public static void main(String[] args) {
        Stack<integer> s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        reverse(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
