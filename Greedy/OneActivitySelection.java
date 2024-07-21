import java.util.ArrayList;

public class OneActivitySelection {
    public static void main(String[] args) {
        int start_time[] = { 1, 3, 0, 5, 8, 5 };
        int end_time[] = { 2, 4, 6, 7, 9, 9 };
        printMaxActivity(start_time, end_time);
    }

    private static void printMaxActivity(int[] start_time, int[] end_time) {
        int maxAct =0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //first activity
        maxAct++;
        arrayList.add(0);
        int endTime = end_time[0];

        for(int i =0;i < start_time.length;i++){
            if(start_time[i] > endTime){
                maxAct++;
                arrayList.add(i);
                endTime = end_time[i];
            }
        }
        System.out.println(maxAct);
        for(int i =0; i<arrayList.size();i++){
            System.out.println("A "+arrayList.get(i));
        }
    }
}