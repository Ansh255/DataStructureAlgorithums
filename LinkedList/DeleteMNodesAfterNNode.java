    class linklist {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        newNode.next = null;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void linkedDelete(Node head, int M, int N) {
        int count = 0;
        Node cur = head;

        while (cur != null && cur.next != null) {
            count++;
            if (count == M) {
                int x = N;
                while (x > 0) {
                    cur.next = cur.next.next;
                    x--;
                }
                cur = cur.next;

            }
        }
    }

    public static void main(String[] args) {
        linklist ll = new linklist();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.print();

        linkedDelete(head, 1, 1);
         ll.print();
    }
}
