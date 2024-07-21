import java.util.LinkedList;

class zigzag {
    public class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode head;
    public static int size;

    public static void zigzagone(){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
        slow = slow.next;
        fast = fast.next.next;
        }

        ListNode mid = slow;


        ListNode cur = mid.next;
        ListNode next;
        ListNode prev = null;
        
        while(cur.next!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode left=head;
        ListNode right = prev;
        ListNode nextLeft,nextRight;

        while(left!=null && right!=null){
            nextLeft= left.next;
            left.next=right;
            nextRight=right.next;
            right.next=nextLeft;

            left= nextLeft;
            right= nextRight;


        }

    } 

   
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
        System.out.println(linkedlist);

        linkedlist.zigzagone();

        System.out.println(linkedlist);
        
    }

}
