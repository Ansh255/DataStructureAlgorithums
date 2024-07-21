import java.util.Scanner;

public class PrintZigZag {
    public static void PrintZigzag(int n){
        if(n==0) {
        return;
        }
        System.out.println("pre "+ n);
        PrintZigzag(n-1);
        System.out.println("In " + n);
        PrintZigzag(n-1);
        System.out.println("pos T " + n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        PrintZigzag(n);
    }
}
