import java.util.*;
import java.awt.Point;
public class Main {
    public static int n;
    public static int k; 
    public static int[][] arr;
    public static int[] dx = new int[]{-1,1,0,0};
    public static int[] dy = new int[]{0,0,-1,1};
    public static int answer_x;
    public static int answer_y;
    public static Queue<Point> q = new LinkedList<>();
    public static boolean[][] visited;
    public static void bfs(int x,int y){
        q.add(new Point(x,y));
        visited[x][y]=true;
        int max=0;
        int cnt=0;

        //범위 밖이거나 주위에 작은값이 없어 움직일 수 없는 경우
        for(int i=0;i<4;i++){
                int mx = x+dx[i];
                int my = y+dy[i];
                if(mx<0 || my<0 || mx>=n || my>=n){
                    cnt++;
                }
                else{                    
                    if(arr[mx][my]>=arr[x][y]){
                        cnt++;
                    }                    
                }
            }if (cnt==4) return;

        //DFS
        while(!q.isEmpty()){
            Point a = q.poll();
            int nx = a.x;
            int ny = a.y;            
            for(int i=0;i<4;i++){
                int mx = nx+dx[i];
                int my = ny+dy[i];                
                    if(mx>=0 && my>=0 && mx<n && my<n){
                        if(!visited[mx][my] && arr[mx][my]<arr[x][y]){
                            q.add(new Point(mx,my));
                            visited[mx][my] = true;
                            max = Math.max(max,arr[mx][my]);                             
                        }                        
                    }                
            }           
        }

        //움직일 수 있는 가장 큰 값중에 행과 열이 가장 작은곳
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
                if(min_x<i){
                    break;
                }
                for(int j=0;j<n;j++){
                    if(arr[i][j]==max && visited[i][j]){         
                        min_x=i;
                        min_y=j;
                        break;
                    }                                                   
                }
            }

        //시작점 업데이트    
        answer_x = min_x;
        answer_y = min_y;                        
    }        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k= sc.nextInt();
        arr = new int[n][n];
        visited = new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt();
        int c = sc.nextInt();
        answer_x=r-1;
        answer_y=c-1;
        for(int i=0;i<k;i++){
            bfs(answer_x,answer_y);
            visited = new boolean[n][n];
        }
        System.out.println((answer_x+1)+" "+(answer_y+1));
    }
}