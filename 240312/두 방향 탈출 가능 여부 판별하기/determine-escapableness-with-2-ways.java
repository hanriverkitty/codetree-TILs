import java.util.*;
public class Main {
    static int[][] arr;
    static int n;
    static int m;
    static int[] nx = new int[]{1,0};
    static int[] ny = new int[]{0,1};
    static boolean[][] visited;

    public static void dfs(int x,int y){
        for (int i=0;i<2;i++){
            int next_x = nx[i]+x;
            int next_y = ny[i]+y;

            if(next_x>=0 && next_y>=0 && next_x<n && next_y<m && arr[next_x][next_y]==1){
                if(!visited[next_x][next_y]){
                    visited[next_x][next_y]=true;
                    dfs(next_x,next_y);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        visited = new boolean[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        dfs(0,0);
        if(visited[n-1][m-1]){
            System.out.print(1);
        }else System.out.print(0);
    }
}