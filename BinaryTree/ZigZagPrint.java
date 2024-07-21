import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ZigZagPrint{
    static class Node {
        int data; 
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left= null;
            this.right= null;
        }
    }
        static ArrayList<Integer> list;
        public static void traverse(Node root){
            if(root == null){
                return;
            }
           Stack<Node> currLevel = new Stack<Node>();
           Stack<Node> nextLevel = new Stack<>();

           currLevel.push(root);
           boolean leftToRight = true;
           
           while(!currLevel.isEmpty()){
            Node node = currLevel.pop();

            list.add(node.data);
            
            if (leftToRight) {
                if(node.left!=null){
                    nextLevel.push(node.left);
                }
                if (node.right!=null) {
                    nextLevel.push(node.right);
                }
            }
            else{
                if (node.right!=null) {
                    nextLevel.push(node.right);
                }
                if(node.left!=null){
                    nextLevel.push(node.left);
                }
            }
            if(currLevel.isEmpty()){
                leftToRight = !leftToRight;
                Stack<Node> temp = currLevel;
                currLevel = nextLevel;
                nextLevel = temp;
            }

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

        list = new ArrayList<Integer>();
        traverse(root);

        
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}