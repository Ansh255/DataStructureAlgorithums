import java.util.ArrayList;

public class root2Leaf {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
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

    public static void path2leaf(Node root , ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        
        }
        path2leaf(root.left, path);
        path2leaf(root.right, path);
        path.remove(path.size()-1);

    }
    private static void printPath(ArrayList<Integer> path) {
       for(int i = 0; i < path.size(); i++){
        System.out.print(path.get(i)+"->");
       }
       System.out.println("N");
    }
    public static void main(String[] args) {
        int arr[] = { 8,5,3,1,4,6,10,11,14};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            root = getBinaryTree(root, arr[i]);
        }
        inOrder(root);
        path2leaf(root, new ArrayList<Integer>());
    }
}
