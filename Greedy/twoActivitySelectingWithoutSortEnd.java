import java.util.ArrayList;

public class twoActivitySelectingWithoutSortEnd {
    public static void main(String[] args) {
        int start_time[] = { 1, 3, 0, 5, 8, 5 };
        int end_time[] = { 2, 4, 6, 7, 9, 9 };
        printMaxActivity(start_time, end_time);
    }

    private static void printMaxActivity(int[] start_time, int[] end_time) {
        
        int maxAct = 0; 
        ArrayList<Integer> list = new ArrayList<Integer>();

        int[][] activity = new int[start_time.length][3];
        for(int i =0 ; i<start_time.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start_time[i];
            activity[i][2] = end_time[i];
        }

        maxAct++;
        list.add(activity[0][0]);
        int end = activity[0][2];

        for(int i = 0 ; i < start_time.length; i++) {
            if(start_time[i] > end) {
                maxAct++;
                list.add(activity[i][0]);
                end = activity[i][2];
            }
        }
        System.out.println(maxAct);
        System.out.println(list);
    }
}
