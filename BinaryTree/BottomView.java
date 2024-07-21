import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;
//logic is based on the level order traversal + vertical level distance and map will store the values at each 
//last node for each last vertical pillar and update evry time using queue data structure
public class BottomView {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        int hd;
        Node root;

        Info(int hd, Node root) {
            this.hd = hd;
            this.root = root;
        }
    }

    public static ArrayList<Integer> bottomView(Node root) {
        Queue<Info> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        
        queue.add(new Info(0, root));
        queue.add(null); // Add null as marker for end of level

        while (!queue.isEmpty()) {
            Info info = queue.poll();
            if (info == null) {
                if (!queue.isEmpty()) {
                    queue.add(null); // Add null as marker for end of next level
                }
            } else {
                int dist = info.hd;
                
                map.put(dist, info.root.data); // Update the map with the latest node at this horizontal distance

                if (info.root.left != null) {
                    queue.add(new Info(dist - 1, info.root.left));
                }
                if (info.root.right != null) {
                    queue.add(new Info(dist + 1, info.root.right));
                }
            }
        }

       ArrayList<Integer> ans = new ArrayList<>();
       for(Entry<Integer, Integer> entry : map.entrySet()) {
        ans.add(entry.getValue());
       }
       return ans;  
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        ArrayList<Integer> ls = bottomView(root);
        System.out.println(ls);
    }
}
