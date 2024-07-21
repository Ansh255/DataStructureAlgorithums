import java.util.Arrays;
import java.util.Comparator;

public class ThreeFractionalKnapsack {
    public static void main(String[] args) {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30};
        int total_weight = 50;

        calculateMaximumValue(value, weight, total_weight);
    }

    private static void calculateMaximumValue(int[] value, int[] weight, int total_weight) {

        double ratio[][] = new double[value.length][2];
        // 0th column is index and 1st column is value/weight

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = total_weight;
        int total_value = 0;
        
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                total_value += value[idx];
            } else {
                total_value += (capacity * ratio[i][1]);
                capacity =0;
                break;
            }

        }
        System.out.println(total_value);
    }
}