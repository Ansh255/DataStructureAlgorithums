public class find_subsets {
    public static void subset(String str , int i ,String ans)
    {
        //base case
        if(str.length() ==i){
            if(ans.length() == 0 ){
                System.out.println("NULL");
            }
            else{
                System.out.println(ans);
            }
             return;
        }
       

        // recursion case
        // CHoice case WHere this recursion case is for yes choice 
        subset(str, i+1, ans+str.charAt(i));

        //no choice case for recusion 
        subset(str, i+1, ans);

        
    }
    public static void main(String[] args) {
        String str = "abc";
        subset(str, 0, "");
    }
}