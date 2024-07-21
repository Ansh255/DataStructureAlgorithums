import java.util.ArrayList;

public class StairCase {
    public static ArrayList<String> moveStairCase(int n){
        if(n==0) {
            ArrayList bes = new ArrayList<String>();
            bes.add("");
            return bes;
        }else if(n<0){
            ArrayList bes = new ArrayList<String>();
            return bes;
        }

        ArrayList<String> path1 = moveStairCase(n-1);
        ArrayList<String> path2 =moveStairCase(n-2);
        ArrayList<String> path3 = moveStairCase(n-3);

        ArrayList NewArrayList = new ArrayList<String>();
        for( String path : path1 ){
            NewArrayList.add(path+1);
        }
        for( String path : path2 ){
            NewArrayList.add(path+2);
        }
        for( String path : path3 ){
            NewArrayList.add(path+3);
        }

        return NewArrayList;

    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList ls = moveStairCase(n);
        System.out.println(ls);
    }
}
