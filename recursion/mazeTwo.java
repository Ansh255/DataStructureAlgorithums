import java.util.ArrayList;
import java.util.Scanner;

public class mazeTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList ls = getMaze(1, 1, n, m);
        System.out.println(ls);
    }

    private static ArrayList<String> getMaze(int sr, int sc, int dc, int dr) {
        ArrayList ls = new ArrayList<String>();
        
        if(sr == dr && sc == dc){
            ArrayList bes = new ArrayList<String>(); 
            bes.add("");
            return bes;
         }

        for (int m = 1; m < dr - sr; m++) {
            ArrayList<String> hpaths = getMaze(sr + m, sc, dc, dr);
            for (String h : hpaths) {
                ls.add("h" + hpaths + m);
            }
        }
        for (int n = 1; n < dc - sc; n++) {
            ArrayList<String> vpaths = getMaze(sr, sc + n, dc, dr);
            for (String v : vpaths) {
                ls.add("v" + vpaths + n);
            }
        }
        for (int n = 1; n < dc - sc && n< dr - sr ; n++) {
            ArrayList<String> dpaths = getMaze(sr + n, sc + n, dc, dr);
            for (String v : dpaths) {
                ls.add("d" + dpaths + n);
            }
        }
        return ls;
    }
}
