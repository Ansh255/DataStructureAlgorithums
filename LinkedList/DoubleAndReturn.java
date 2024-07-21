import java.util.ArrayList;
import java.util.LinkedList;

class Solution {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode doubleIt(ListNode head) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        while (head.next != null) {
            ls.add(head.val);
            head = head.next;
        }
        int i = 0;
        int value = 0;
        while (ls.isEmpty()) {
            if (i == 0) {
                value = ls.get(i);
                ls.remove(i);
                i++;
            } else {
                value = value * 10 + ls.get(i);
                ls.remove(i);
                i++;
            }
        }

        value = value * 2;
        while (value > 0) {
            int digit = value % 10;
            ls.add(0, digit); // Adding at index 0 to maintain the order
            value /= 10;
        }
        int z = 0;
        while (head.next != null) {
            head.val = ls.get(z);
            z++;
            head = head.next;
        }
        return head;

    }

    public static void main(String[] args) {

    }

}