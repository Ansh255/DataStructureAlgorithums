import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SixIndianCoins {
    public static void main(String[] args) {
        Integer coins[] ={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        
        int total_amount = 590;
        ArrayList<Integer> coinUsed = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < coins.length; i++) {
            if(coins[i] <= total_amount){
            while (coins[i] <= total_amount) {
                    count++;
                    coinUsed.add(coins[i]);
                    total_amount -= coins[i];
                }
            }
        }
        System.out.println(count);
        System.out.println(coinUsed);
    }
}
