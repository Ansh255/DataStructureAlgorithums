public class lastoccurance {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 4, 2, 2, 2, 1 };
        int key = 2;
        int i = 0;
        System.out.print(lastoccurance(arr, key, i));
    }

    public static int lastoccurance(int[] arr, int key, int i) {
        if (arr.length == i) {
            return -1;
        }
        int missa = lastoccurance(arr, key, i + 1);
        if (missa == -1) {
            if (arr[i] == key) {
                return i;
            } else {
                return -1;
            }
        } else {
            return missa;
        }
    }
}