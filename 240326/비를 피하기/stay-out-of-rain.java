import java.util.*;
import java.awt.Point;
public class Main {
    public static int[][] arr;
    public static boolean[][] visited;
    public static int[][] answer;
    public static int[][] temp;
    public static int n;
    public static Queue<Point> q = new LinkedList<>();
    public static int[] dx = new int[]{-1,1,0,0};
    public static int[] dy = new int[]{0,0,-1,1};
    public static void bfs(int x, int y){
        int cnt=0;
        q.clear();       
        q.add(new Point(x,y));
        visited[x][y]=true;
        temp = new int[n][n];
        visited = new boolean[n][n];
        while(!q.isEmpty()){
            Point a = q.poll();
            int nx = a.x;
            int ny = a.y;
            for(int i=0;i<4;i++){
                int mx = nx+dx[i];
                int my = ny+dy[i];
                if(mx>=0 && my>=0 && mx<n && my<n){
                    if(visited[mx][my]==false && (arr[mx][my]==2 || arr[mx][my]==0)){
                        visited[mx][my]=true;
                        q.add(new Point(mx,my));
                        temp[mx][my]=temp[nx][ny]+1;
                    }
                    else if (visited[mx][my]==false && arr[mx][my]==3){
                        visited[mx][my]=true;
                        answer[x][y]=temp[nx][ny]+1;                        
                        return;
                    }
                }
            }
        }
        if (answer[x][y]==0){
            answer[x][y]=-1;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n][n];
        answer = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==2){
                    bfs(i,j);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(answer[i][j]+" ");
            }
            System.out.println();
        }

    }
}