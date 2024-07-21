import java.util.ArrayList;
import java.util.Collections;

public class TenKthLargestOdd {
    public static void main(String[] args) {
        int L = -3;
        int R = 3;
        int k = 1;
        findKthLargeOdd(L, R, k);
    }

    private static void findKthLargeOdd(int l, int r, int k) {
        // step1 add all odd in range of l to r the element in arraylist
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = l; i <= r; i++) {
            if (i % 2 != 0) {
                list.add(i);
            }
        }

        Collections.sort(list, (a, b) -> b - a);

        System.out.println(list.get(k-1));
    }

}
