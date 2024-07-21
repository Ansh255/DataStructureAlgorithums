import java.util.Scanner;

public class nqueen{
    public static void check_queen(int chess[][] , String qsf , int row){
    if(row == chess.length){
        System.out.println(qsf + ", ");
        return;
    }
    for(int col = 0; col < chess.length; col++){
        if(IsSafeForQueen(chess , row, col)== true){
            chess[row][col] = 1;
            check_queen(chess, qsf+row+" - "+ col+" ,", row+1);
            chess[row+1][col] = 0;
        }
    }
}
public static boolean IsSafeForQueen(int chess[][] , int row , int col){
    for(int i = row -1 , j = col ;i>=0;j--){
        if(chess[row][j] == 1){
            return false;
        }
    }
    for(int i = row -1 , j = col - 1 ; i>=0 && j>=0 ;i--,j--){
        if(chess[row][j] ==1){
            return false;
        }
    }
    for(int i = row - 1 ;  j = col +1 , i>=0 ;j < chess.length ; i--,j++){
        if(chess[row][j] ==1){
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int chess[][] = new int[n][n];
      
       check_queen(chess, "", 0);
    }
}