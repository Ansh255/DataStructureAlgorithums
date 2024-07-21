public class queueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null && tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);

            if (isEmpty()) {
                head = tail = newNode;
            }

            tail.next = newNode;
            tail = newNode;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                tail = head = null;
            } else {

                head = head.next;
            }
            return head.data;

        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while(!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
           }
    
    }
}
