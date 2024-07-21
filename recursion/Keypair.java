import java.util.ArrayList;

public class Keypair {
    static String charA[] = { "?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "wxyz", ".," };

    public static void main(String[] args) throws Exception {
        String str = "576";
        ArrayList<String> words = KeypairCombo(str);
        System.out.println(words);
    }

    private static ArrayList<String> KeypairCombo(String str) {
        if (str.length() == 0) {
            ArrayList<String> emp = new ArrayList<String>();
            emp.add("");
            return emp;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> rres = KeypairCombo(ros);
        ArrayList<String> newres = new ArrayList<String>();

        String chos = charA[ch - '0'];
        for (int i = 0; i < chos.length(); i++) {
            char curres = chos.charAt(i);
            for (String rString : rres) {
                newres.add(rString + curres);
            }

        }
        return newres;

    }
}
