import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BurningTree {
    static class Node{
        int data;
        Node left;
        Node right ;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static HashMap<Node, Node> mapping = new HashMap<Node, Node>();
    public static Node parentMapping(Node root,int start){
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node target = null;
        while(queue.size() > 0){
            int n = queue.size();
            for(int i = 0; i < n; i++){
                Node node = queue.remove();
                if(node.data ==start){
                    target = node;
                }
                if(node.left != null){
                    mapping.put(node.left,node);
                    queue.add(node.left);
                }
                if(node.right != null){
                    mapping.put(node.right,node);
                }
            }
        }
        return target;
    }
    public static int timeTakenToBurn(Node target){
        Queue<Node> queue = new LinkedList<>();
        HashMap<Node,Integer> visited = new HashMap<>();

        queue.add(target);
        visited.put(target, 1);
        int time = 0;

        while (queue.size() > 0) {
            int n = queue.size();
            boolean flag =false;
            for(int i = 0;i<n;i++){
                Node temp = queue.poll();
                if(temp.left!=null && visited.get(temp.left) == null){
                    visited.put(temp.left, 1);
                    queue.add(temp.left);
                    flag = true;
                }
                if(temp.right!=null && visited.get(temp.right) == null){
                    visited.put(temp.right, 1);
                    queue.add(temp.right);
                    flag = true;
                }
                if(mapping.get(temp) != null && visited.get(mapping.get(temp))!=null){
                    visited.put(mapping.get(temp),1);
                    queue.add(mapping.get(temp));
                    flag = true;
                }
            }
            if(flag == true){
                time++;
            }
        }
        return time;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        Node targetNode = parentMapping(root,2 );
        int time = timeTakenToBurn(targetNode);
        System.out.println(time);
        
    }
}
