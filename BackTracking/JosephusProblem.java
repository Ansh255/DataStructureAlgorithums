public class JosephusProblem {
    public static int solution(int n , int k){
        int x = solution(n-1, k);
        int y = (x+ k)%n;
        return y;
    }
    public static void main(String[] args) {
        solution(5, 3); 
    }
}
