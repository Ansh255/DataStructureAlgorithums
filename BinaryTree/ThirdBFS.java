import java.util.*;
public class ThirdBFS {
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
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            Node curNode = queue.remove();
            if(curNode == null){
                System.out.println();
                if(queue.isEmpty()){
                    break;
                }
                else{
                    queue.add(null);
                }
            }
            else{
                System.out.print(curNode.data+"");
                if(curNode.left != null){
                    queue.add(curNode.left);
                }
                if (curNode.right != null){
                    queue.add(curNode.right);   
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node newNode = tree.buildTree(nodes);
        levelOrder(newNode);
    }
}
