public class SixDiameterAPP1 {
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
    public static int getDiameter(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int leftDiameter = getDiameter(root.left);
        int rightHeight = getHeight(root.right);
        int rightDiameter = getDiameter(root.right);
        int selfDiameter = leftHeight + rightHeight + 1;
        return Math.max(selfDiameter, Math.max(rightDiameter,leftDiameter));
    }

    public static int getHeight(Node root) {
       if(root == null){
        return 0;
       }
       int leftHeight = getHeight(root.left);
       int rightHeight = getHeight(root.right);
       return Math.max(leftHeight,rightHeight) +1;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.println(getDiameter(root));
    }
    
}
