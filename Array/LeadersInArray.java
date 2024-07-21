import java.util.*;
public class LeadersInArray{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int arr[]= {16,17,4,3,5,2};
        int n = arr.length;
        int maxi = arr[n-1];
        list.add(maxi);
        for(int i = n-2 ; i >= 0 ; i--) {
            if(arr[i] >= maxi) {
                maxi = arr[i];
                list.add(maxi);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}