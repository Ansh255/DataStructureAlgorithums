import java.util.ArrayList;

public class ElevethMinimumDistanceBetweenNode {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int findDistance(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<Node>();
        ArrayList<Node> path2 = new ArrayList<Node>();

        // Get paths from root to n1 and n2
        if (!getPath(root, n1, path1) || !getPath(root, n2, path2)) {
            return -1; // If either node is not present in the tree
        }

        // Find LCA
        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        System.out.println("value of i"+i);

        for (int i2 = 0; i2< path1.size(); i2++){
            System.out.println("path1 "+path1.get(i2).data);
        }
        for (int i2 = 0; i2< path2.size(); i2++){
            System.out.println("path2 "+path2.get(i2).data);
        }
        System.out.println("path1 - i "+(path1.size() - i));
        System.out.println("path2 - i "+(path2.size() - i));
        // Distance is sum of distances from LCA to n1 and n2
        return (path1.size() - i) + (path2.size() - i);
    }

    private static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        if (getPath(root.left, n, path) || getPath(root.right, n, path)) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        int distance = findDistance(root, 4, 3);
        if (distance != -1) {
            System.out.println("Minimum distance between nodes: " + distance);
        } else {
            System.out.println("One or both nodes not found in the tree.");
        }
    }
}
