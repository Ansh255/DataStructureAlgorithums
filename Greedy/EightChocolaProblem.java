import java.util.Arrays;
import java.util.Comparator;

public class EightChocolaProblem {
    public static void main(String[] args) {
        Integer costHor[] = { 4, 1, 2 };
        Integer costVer[] = { 2, 1, 3, 1, 4 };

        Arrays.sort(costHor, Comparator.reverseOrder());
        Arrays.sort(costVer, Comparator.reverseOrder());

        int cost = 0;
        int h = 0, v = 0;
        int hp = 1, vp = 1;

        while (h < costHor.length && v < costVer.length) {
            if (costHor[h] >= costVer[v]) {
                cost += (costHor[h] * vp);
                h++;
                hp++;
            } else {
                cost += (costVer[v] * hp);
                v++;
                vp++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            h++;
            hp++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            v++;
            vp++;
        }
        System.out.println(cost);
    }

}