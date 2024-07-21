public class printString{
    static String digits[] ={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void printStringMethod(int number){
        if(number == 0){
            return;
        }

        int last = number % 10;
        printStringMethod(number/10);
        System.out.print(digits[last]+" ");
    }
    public static void main(String[] args) {
        printStringMethod(1947);
    }
}