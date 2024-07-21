import java.util.Scanner;

public class printEncodeStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        EncodeString(str,"");
        
    }

    private static void EncodeString(String str,String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
            
        }else if(str.length() == 1) {
            char ch = str.charAt(0);
            if(ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                char code = (char) ('a' + chv -1);
                System.out.println(asf = asf + code);   
            }
        }
        else{
            char ch = str.charAt(0);
            String ros = str.substring(1);
            if(ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                char code = (char) ('a' + chv -1);
                EncodeString(ros, asf + code);
            }
            String ch12 = str.substring(0,2);
            String roq = str.substring(2);

            int chv  = Integer.parseInt(ch12);
            if(chv <= 26 ){
                char code = (char) ('a' + chv -1);
                EncodeString(roq, code+asf);
            }


        }   
    }
}
