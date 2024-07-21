import java.util.Scanner;

public class permutation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        permutationsCombo(str, "");
    }

    private static void permutationsCombo(String str, String ques) {
        if(str.length() == 0){
            System.out.println(ques);
            return;
        }
        for(int i=0; i < str.length(); i++) {
            char c = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String total = left + right;
            permutationsCombo(total, ques+c );
            }


    }
}