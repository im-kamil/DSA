import java.util.Queue;

public class Queue3implement { // implement using linkedlist
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        // add or enqueue
        public static void add(int data) {
            // first element to add
            Node newNode = new Node(data);
            if (tail == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // dequeue or remove O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty dequeue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty dequeue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        // 1,2,3
        q.add(4);
        q.add(5);
        // System.out.println(q.remove());
        // q.add(6);
        // System.out.println(q.remove());
        // q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
