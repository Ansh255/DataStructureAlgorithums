class Solution {
    public static int balancedStringSplit(String s) {
        int count = 0; 
        int R = 0;
        int L=0;
        int i =0;
        while(i < s.length()){
            if(s.charAt(i)=='R'){
                R++;
                
            }
            if(s.charAt(i) == 'L'){
                L++;
                
            }
            i++;
            if(R == L){
                count++;
                R=0;
                L=0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
       int n = balancedStringSplit(s);
       System.out.println(n);
    }
}