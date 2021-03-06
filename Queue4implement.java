import java.util.*;

public class Queue4implement { // easy implement using java collection
    public static void main(String[] args) {
        // Queue<integer> q = new LinkedList<>();
        Queue<integer> q = new ArrayDeque<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // q.add(4);
        // q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
// //queue using 2 stacks
// import java.util.*;
 
// public class QueueB {
//    static class Queue {
//        static Stack<Integer> s1 = new Stack<>();
//        static Stack<Integer> s2 = new Stack<>();
 
//        public static boolean isEmpty() {
//            return s1.isEmpty();
//        }
 
//        public static void add(int data) {
//            while(!s1.isEmpty()) {
//                s2.push(s1.pop());
//            }
//            s1.push(data);
//            while(!s2.isEmpty()) {
//                s1.push(s2.pop());
//            }
//        }
 
//        public static int remove() {
//            return s1.pop();
//        }
 
//        public static int peek() {
//            return s1.peek();
//        }
//    }
//    public static void main(String args[]) {
//        Queue q = new Queue();
//        q.add(1);
//        q.add(2);
//        q.add(3);
 
//        while(!q.isEmpty()) {
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
// }
