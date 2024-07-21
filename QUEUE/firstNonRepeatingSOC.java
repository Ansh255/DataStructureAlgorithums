import java.util.*;

public class firstNonRepeatingSOC {
    public static void printNonRepeating(String s) {
        // step 1 frequency array 'a'- 'z'
        int freq[] = new int[26];

        // step 2 make a queue for in out of the stream of character
        Queue<Character> q = new LinkedList<Character>();

        // step 3 loop for increasing frequency of characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            // System.out.print(freq[ch - 'a']);

            // step 4 remove character from queue whole freq is more than one

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            // queue is empty
            if (q.isEmpty()) {
                System.out.print(-1 + " ");

            } else {
                System.out.print(q.peek() + " ");
            }
           
        }
    }

    public static void main(String[] args) {
        String s = "aabccxb";
        printNonRepeating(s);
    }
}
