public class PracticeOneUnivalued{
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
    
        public static boolean isUnivalued(Node root,int data){
            if(root == null){
                return true;
            }
            if(root.data != data){
                return false;
            }
            boolean checkLeft = isUnivalued(root.left, data);
            boolean checkRight = isUnivalued(root.right, data);

            if (checkLeft == false || checkRight == false) {
                return false;
            }
            return true;
        }
    public static void traverse(Node root)
{
    int flag = root.data;
    if (isUnivalued(root, flag)) {
        System.out.println("YES");
    }
    else{
        System.out.println("NO");
    }

}    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(2);
       root.right = new Node(2);
         root.left.left = new Node(5);
         root.left.right = new Node(2);
        traverse(root);
    }
}