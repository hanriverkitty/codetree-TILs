import java.util.*;
import java.awt.Point;
public class Main {
    static int r1,c1,r2,c2;
    static int[] dx = new int[]{2,2,1,1,-1,-1,2,-2};
    static int[] dy = new int[]{1,-1,2,-2,2,-2,-1,1};
    static int[][] arr;
    static boolean[][] visited;
    static int n;
    static Queue<Point> q = new LinkedList<>();
    public static void bfs(){
        while(!q.isEmpty()){
            Point a = q.poll();
            int nx = a.x;
            int ny = a.y;
            for (int i=0;i<8;i++){
                int new_x = nx+dx[i];
                int new_y = ny+dy[i];
                if(new_x >=1 && new_y>=1 && new_x<=n && new_y<=n){
                    if(!visited[new_x][new_y]){
                        visited[new_x][new_y]=true;
                        arr[new_x][new_y] = arr[nx][ny]+1;
                        q.add(new Point(new_x,new_y));
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];
        visited[r1][c1]=true;
        q.add(new Point(r1,c1));        
        bfs();
        if (!visited[r2][c2]){
            System.out.print(-1);
        }
        else System.out.print(arr[r2][c2]);
    }
}