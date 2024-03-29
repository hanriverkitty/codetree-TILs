import java.util.*;
import java.awt.Point;
public class Main {
    public static int n;
    public static int m;
    public static boolean[][] visited;
    public static int[][] dist;
    public static int[][] arr;
    public static Queue<Point> q = new LinkedList<>();
    public static int[] dx = new int[]{1,-1,0,0};
    public static int[] dy = new int[]{0,0,1,-1};

    public static void bfs(){
        while(!q.isEmpty()){
            Point now = q.poll();
            int x = now.x;
            int y = now.y;
            for (int i=0;i<4;i++){
                int next_x = x+dx[i];
                int next_y = y+dy[i];
                if(next_x>=0 && next_y>=0 && next_x<n && next_y<m){
                    if(visited[next_x][next_y]==false && arr[next_x][next_y]==1){
                        dist[next_x][next_y] = dist[x][y]+1;
                        visited[next_x][next_y]=true;
                        q.add(new Point(next_x,next_y)); 
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        dist = new int[n][m];
        visited = new boolean[n][m];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        q.add(new Point(0,0));
        visited[0][0]=true;
        dist[0][0]=0;
        bfs();
        if(dist[n-1][m-1]!=0){      
        System.out.println(dist[n-1][m-1]);}
        else System.out.print(-1);
      
    }
}