import java.util.*;
public class Main {
    public static int n;
    public static int k; 
    public static int[][] arr;
    public static int[] dx = new int[]{-1,1,0,0};
    public static int[] dy = new int[]{0,0,-1,1};
    public static int answer_x;
    public static int answer_y;
    public static void bfs(int x,int y){
        if(noMove(x,y)){
            int max = 0;
            int min_x = Integer.MAX_VALUE;
            int min_y = Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(arr[x][y]>arr[i][j]){
                        max = Math.max(arr[i][j],max);                          
                    }
                }
            }
            
            for(int i=0;i<n;i++){
                if(min_x<i){
                    break;
                }
                for(int j=0;j<n;j++){
                    if(arr[i][j]==max){         
                        min_x=i;
                        min_y=j;
                        break;
                    }                                                   
                }
            }
            answer_x = min_x;
            answer_y = min_y;
        }                     
    }        
    
    public static boolean noMove(int x, int y){
        int cnt = 0;
        for(int i=0;i<4;i++){
            int mx = x+dx[i];
            int my = y+dy[i];
            if(mx<0 || my<0 || mx>=n || my>=n){
                cnt++;
            }
            else{
                if(mx>=0 && my>=0 && mx<n && my<n){
                    if(arr[mx][my]>arr[x][y]){
                        cnt++;
                    }
                }
            }
        }
        if (cnt==4) return false;
        else return true;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k= sc.nextInt();
        arr = new int[n][n];
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
        }
        System.out.println((answer_x)+" "+(answer_y));
    }
}