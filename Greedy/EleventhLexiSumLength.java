import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class EleventhLexiSumLength {
    public static void lexo_small(int n, int k) {
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        k =k -arr.length;

       int  currentChar = 0;

       while (k>0) {
        currentChar =Math.min(25, k);
        arr[--n] += currentChar;
        k-=currentChar;

       }
        System.out.println(arr);
    }

    public static void main(String[] args) {
        int n = 5, k = 42;
        lexo_small(n, k);
        // System.out.print(arr);
    }
}
