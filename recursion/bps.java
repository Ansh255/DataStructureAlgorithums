public class bps{
    public static void printBinaryString(String str ,int lastPlace , int n ){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinaryString(str+"0", 0, n-1);
        if(lastPlace == 0){
            printBinaryString(str+"1", 1, n-1);
        }
    }
    public static void main(String[] args) {
        printBinaryString(  "", 0, 3);
    }
}