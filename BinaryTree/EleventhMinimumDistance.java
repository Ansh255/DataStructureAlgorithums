public class EleventhMinimumDistance {
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
    public static Node getLca(Node root, int n1 , int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }
        Node leftLca= getLca(root.left, n1, n2);
        Node rightLca= getLca(root.right, n1, n2);

        if(leftLca == null){
            return rightLca;
        }
        if (rightLca == null){ {
            return leftLca;
        }
    }
    return root;
    }
    public static int minDist(Node root, int n1 , int n2){
        Node lca = getLca(root , n1, n2);
        int leftDist = lca(lca,n1);
        int rightDist = lca(lca,n2);
        return rightDist + leftDist;
    }
    public static int lca(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int findLeft = lca(root.left,n);
        int findRight = lca(root.right,n);

        if(findLeft == -1 && findRight == -1){
            return -1;
        }
        else if(findLeft == -1){
            return findRight+1;
        }
        else{
            return findLeft+1;
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
        System.out.println(minDist(root, 4, 3));
    }
}
