import java.util.*;
import java.awt.Point;
public class Main {
    static int n;
    static int k;
    static int[][] arr;
    static Queue<Point> q = new LinkedList<>();
    static boolean[][] visited;
    static int answer=1;
    static int[] dx = new int[]{1,-1,0,0};
    static int[] dy = new int[]{0,0,1,-1};

    public static void bfs(int x, int y){
        q.add(new Point(x,y));
        while(!q.isEmpty()){
            Point d = q.poll();
            int nx = d.x;
            int ny = d.y;
            for (int i=0;i<4;i++){
                int new_x = nx+dx[i];
                int new_y = ny+dy[i];
                if (new_x>=1 && new_y>=1 && new_x<=n && new_y<=n){
                    if(!visited[new_x][new_y] && arr[new_x][new_y]==0){
                        visited[new_x][new_y]=true;
                        answer++;
                     
                        q.add(new Point(new_x,new_y));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i=0;i<k;i++){
            int r = sc.nextInt();
            int c = sc.nextInt();
            visited[r][c] = true;
            bfs(r,c);
        }
        System.out.print(answer);
    }
}