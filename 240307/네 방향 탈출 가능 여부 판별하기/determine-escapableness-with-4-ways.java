import java.util.*;
import java.awt.Point;
public class Main {
    public static int[] dx = new int[]{1,-1,0,0};
    public static int[] dy = new int[]{0,0,1,-1};
    public static int[][] arr;
    public static int n;
    public static int m;
    public static Queue<Point> q = new LinkedList<>();
    public static boolean[][] visited;


    public static void bfs(){

        // 탐색 큐가 빌때까지 반복
        while(!q.isEmpty()){
            // 큐 맨앞원소 반환
            Point cur = q.poll();
            int x = cur.x;
            int y= cur.y;

            // 4방향 탐색
            for (int i=0;i<4;i++){
                int next_x  = x + dx[i];
                int next_y = y +dy[i];
                if(next_x>=0 && next_y>=0 && next_x<m && next_y<n){
                    if(visited[next_x][next_y]==false && arr[next_x][next_y]==1){
                        q.add(new Point(next_x,next_y));
                        visited[next_x][next_y]=true;
                        
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
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // 방문 여부 배열 초기화
        visited = new boolean[n][m];
        for (boolean[] b:visited){
            Arrays.fill(b,false);
        } 

        // (0,0) 시작점
        q.add(new Point(0,0));
        visited[0][0] = true;
        bfs();

        // 마지막 칸으로 탈출여부
        if(visited[n-1][m-1]==true){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}