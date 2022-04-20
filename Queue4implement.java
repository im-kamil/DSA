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
