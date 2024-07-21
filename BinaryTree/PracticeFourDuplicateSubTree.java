import java.util.HashMap;

class solution{
    static HashMap<String,Integer> map = new HashMap<String,Integer>();
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static String findDuplicatSNodeSubtree(Node root){
        if(root == null){
            return "";
        }
        String s = "(";
        s+= findDuplicatSNodeSubtree(root.left);
        s+= Integer.toString(root.data);
        s+= findDuplicatSNodeSubtree(root.right);
        s+= ")";

        if(map.get(s) != null && map.get(s) == 1){
            System.out.print(root.data+" ");
        }
        if (map.containsKey(s)) {
            map.put(s, map.get(s)+1);
        }
        else{
            map.put(s, 1);
        }
        return s;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
    }
}
