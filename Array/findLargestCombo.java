import java.util.*;

public class findLargestCombo {
    private static void printlargest(Vector<String> arr) {

        Collections.sort(arr, new Comparator<String>() {
            public int compare(String x, String y) {
                String xy = x + y;
                String yx = y + x;

                return xy.compareTo(yx) > 0 ? -1 : 1;
            }
        });
        Iterator it = arr.iterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

    public static void main(String[] args) {
        Vector<String> arr;
        arr = new Vector<>();

        // output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printlargest(arr);
    }

}