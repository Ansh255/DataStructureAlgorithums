import java.util.LinkedList;
import java.util.Queue;

public class NineKthLevelTreeLevelOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void levelOrderKth(Node root, int level) {
        Queue<Node> q = new LinkedList<Node>();

        int count = 1;
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node cur = q.remove();
            if (cur == null) {
                // System.out.println();
                //why i increased here because when the node becomes null means that level is over
                count++;
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                } 
            } else {
                if (count == level) {
                    System.out.print(cur.data);
                }
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }

        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        levelOrderKth(root, 3);
    }
}
