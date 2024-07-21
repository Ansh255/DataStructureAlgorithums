import java.util.Arrays;

public class MinimumAbsoluteDifference{
    public static void main(String[] args) {
        int []A = {2,1,3};
        int []B =  {3,2,1 };

        Arrays.sort(A);
        Arrays.sort(B);

        int absDiff = 0 ;
        for(int i = 0; i < A.length; i++){
            absDiff += Math.abs(A[i]- B[i]);
        }
        System.out.println(absDiff);
    }
}