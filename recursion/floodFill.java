import java.util.Scanner;

public class floodFill {
    public static void floodfill(int maze[][] , int row , int col , String psf, boolean[][] visited){
        if(row <0 || col <0 || row == maze.length || col == maze[0].length || maze[row][col] == 1 || visited[row][col]== true){
            return;
        }
        if(row == maze.length-1 || col == maze[0].length-1){
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        floodfill(maze, row-1, col, psf+"top ", visited);
        floodfill(maze, row, col-1, psf+"left ", visited);
        floodfill(maze, row+1, col, psf+"down ", visited);
        floodfill(maze, row, col+1, psf+ "right ", visited);
        visited[row][col] = false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int maze[][] =new int[n][m];

        for(int i = 0 ; i<maze.length; i++){
            for(int j = 0 ; j<maze[0].length; j++){
                maze[i][j] = sc.nextInt();
            }
        }

        boolean[][] visited = new boolean[n][m];

        floodfill(maze, n, m, "", visited);
    }
}
