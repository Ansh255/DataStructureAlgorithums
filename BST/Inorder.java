public class Inorder{
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
    public static boolean inorderTraversal(Node root,int key){
        if(root ==null){
            return false;
        }
        if(root.data == key ){
            return true;
        }
        if(root.data < key){
            return inorderTraversal(root.right, key);
        }
        else{
        return inorderTraversal(root.left, key);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.right = new Node(6);
        if(inorderTraversal(root, 1)){
            System.out.println("found " );
        }
        else{
            System.out.println("not found ");
        }
    }

}