public class two_CircularQueueArray {

    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        // empty c queue
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add remove and peek
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            int front = arr[0];
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                front = rear = 0;
            } else {
                front = (front + 1) % size;
            }
            return result;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
