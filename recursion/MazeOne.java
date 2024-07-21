import java.util.ArrayList;
import java.util.Scanner;

public class MazeOne{
    public static ArrayList<String> getMaze(int sr,int sc ,int dr, int dc) {
        if(sr == dr && sc == dc){
           ArrayList bes = new ArrayList<String>(); 
           bes.add("");
           return bes;
        }

        ArrayList newarArrayList = new ArrayList<String>();

         ArrayList<String> vpath = new ArrayList<String>();
         ArrayList<String> hpath = new ArrayList<String>();

        if(sr<dr){
            vpath = getMaze(sr+1, sc, dr, dc);
        }
        if(sc<dc){
            hpath = getMaze(sr, sc+1, dr, dc);
        }
        for(String v : vpath){
            newarArrayList.add("v"+vpath);
        }
        for(String hString : hpath){
            newarArrayList.add("h"+hpath);
        }
        return newarArrayList;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n   = sc.nextInt();
        int m  = sc.nextInt();
        

        ArrayList ls = getMaze(1, 1, n, m);
        System.out.println(ls);
    }
}