import java.util.ArrayList;
import java.util.HashMap;

public class LeftViewBinaryTree {
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

    static int count = 0;

    public static void traverse(Node root, int level) {
        if (root == null) {
            return ;
        }
        if (count < level) {
            System.out.println(root.data + " ");
            count = level;
        }

        traverse(root.right, level + 1);
         traverse(root.left, level + 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(8);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        traverse(root, 1);
    }
}
