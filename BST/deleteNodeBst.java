public class deleteNodeBst {
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

    public static Node delete(Node root, int val) {
        if (root.data < val) {
            root.right = delete(root.right, val);
        } else if (root.data > val) {
            root.left = delete(root.left, val);
        } else {
            // case 1 if the root is leaf node
            if (root.left == null && root.right == null) {
                return null;
            }   
            // case 2 if the root is single child;
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // suppose a function return inorder successor
            Node is = findInorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);
        }
        return root;
    }

    private static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static Node getBinaryTree(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = getBinaryTree(root.left, val);
        } else {
            root.right = getBinaryTree(root.right, val);
        }

        return root;
    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    

    public static void main(String[] args) {
        int arr[] = { 8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = getBinaryTree(root, arr[i]);
        }
        inOrder(root);
        delete(root, 1);
        System.out.println();
        inOrder(root);
    }
}
