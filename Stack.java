
public class Stack {
    static class node {
        Node data;
        Node next;

        public void Node(int data){
            this.data = next;
            next = null;
        }
    }

    static class stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) { // push function
            Node newNode = new Node();
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() { // pop funtion
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() { // peek funtion
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    private void pop() {
    }

    private char[] peek() {
        return null;
    }

    private boolean isEmpty() {
        return false;
    }

    private void push(int i) {
    }
}
