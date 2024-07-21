public class LenofString {
    public static void main(String[] args) {
        String s = "Heloosudocode";
        CountLenOFString(s,0);
        
    }

    private static void CountLenOFString(String s,int count)  {
        if( count == s.length()){
            System.out.println();
            System.out.println(count);
            return ;
        }
        
        System.out.print(s.charAt(count)+" ");
       
        CountLenOFString(s,count+1);
        
       
    }
}
