import java.util.*;
import java.awt.Point;
public class Main {
    public static ArrayList<Integer> cnt = new ArrayList<>();
    public static int[][] arr;
    public static boolean[][] visited;
    public static int[] dx = new int[]{-1,1,0,0};
    public static int[] dy = new int[]{0,0,-1,1};
    public static int n;
    public static int cnt_p;
    public static void dfs(int x,int y){
        for(int i=0;i<4;i++){
            int mx = x+dx[i];
            int my = y+dy[i];
            if(mx>=0 && my>=0 && mx<n && my<n){
                if(arr[mx][my]==1){
                    arr[mx][my]=0;
                    cnt_p++;
                    dfs(mx,my);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    cnt_p=1;
                    arr[i][j]=0;
                    dfs(i,j);
                    cnt.add(cnt_p);
                }
            }
        }
        System.out.println(cnt.size());
        Collections.sort(cnt);
        for(int a:cnt){
            System.out.println(a);
        }
    }
}