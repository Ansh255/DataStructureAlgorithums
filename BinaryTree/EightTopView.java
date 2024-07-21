import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class EightTopView{
    //Node class
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    //Info class which contains information about horizontal distance and node
    static class Info{
        Node root;
        int hd;
        public Info(Node root, int hd) {
            this.root = root;
            this.hd = hd;
        }
    }
    //topview
    public static void topView(Node root){
        Queue<Info> q = new LinkedList<>() ;
        HashMap<Integer,Node> map = new HashMap<>();
        int min =0;
        int max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
        if(curr == null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
            }
        }
        else{
            int dist = curr.hd;
            if(!map.containsKey(dist)){
                map.put(curr.hd, curr.root);
            }
            if(curr.root.left !=null){
                q.add(new Info(curr.root.left,dist-1));
                 min = Math.min(min,curr.hd-1);
            }
            if(curr.root.right !=null){
                q.add(new Info(curr.root.right,dist+1));
                max = Math.max(max,curr.hd+1);
            }   

        }
    }
        for(int i = min; i <= max; i++){
            System.out.println(map.get(i).data);
        }
        
    }

    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);
        topView(root);
        
    }
}