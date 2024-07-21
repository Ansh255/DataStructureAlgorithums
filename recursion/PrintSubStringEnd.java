public class PrintSubStringEnd {
    public static void printSubString(String s, int i , String ans){
        if(s.length() == i){
            if(ans.length() == 0 ){
                System.out.println("NULL");
            }
            else{
                if(ans.charAt(0)== ans.charAt(ans.length()-1)){
                System.out.println(ans);
                }
            }
             return;
        }
        printSubString(s, i+1, ans+s.charAt(i));
        printSubString(s, i+1, ans);
    }
    public static void main(String[] args) {
        printSubString("aba", 0, "");
    }
}
