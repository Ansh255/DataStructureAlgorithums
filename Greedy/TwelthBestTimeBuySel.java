public class TwelthBestTimeBuySel {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int n = prices.length;

        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 0; i < n; i++) {
            if(buy >prices[i]){
                buy = prices[i];
            }
            else if(prices[i]-buy > maxProfit){
                maxProfit = prices[i];
            }
        }
        System.out.println(maxProfit);
    }
    
}
