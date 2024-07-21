import java.util.LinkedList;

class solution {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    private Node merge(Node newLeft, Node newRight) {
        Node mergedLinkedList = new Node(-1);
        Node temp = mergedLinkedList;
        while(newLeft != null && newRight!=null){
            if(newLeft.data <= newRight.data){
            temp.next = newLeft;
            newLeft = newLeft.next;
            temp=temp.next;
            }
            else{
                temp.next = newRight;
                newRight = newRight.next;
                temp = temp.next;
            }
        }
        while(newLeft != null){
            temp.next=newLeft;
            newLeft=newLeft.next;
            temp=temp.next;
        }
        
        while(newRight != null){
            temp.next=newRight;
            newRight=newRight.next;
            temp=temp.next;
        }
        return mergedLinkedList.next;
    }

    private Node getMid(Node head) {
        Node slow= head;
        Node fast = head.next;

        while(fast.next != null && fast!=null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;
    }
    public static void print(){

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        
       
    }
}