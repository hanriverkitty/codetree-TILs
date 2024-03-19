import java.util.*;
public class Main {
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,-1,1};
    static int n;
    static int[][] ball;
    static int[][] arr;
    static int[][] temp;
    public static void move(int x,int y,int[][] temp){
        int max = 0;
        int max_x,max_y;
        max_x=max_y=0;
        for(int i=0;i<4;i++){
            int mx = x+dx[i];
            int my = y+dy[i];
            if(mx>=0 && my>=0 && mx<n && my<n){
                if(arr[mx][my]>max){                   
                        max_x=mx;
                        max_y=my;
                        max=arr[mx][my];                    
                }
            }
        }
        temp[max_x][max_y]++;
        temp[x][y]--;
        System.out.println(Arrays.deepToString(temp));          
    }
    
    //
    public static void check_balls(){
        temp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ball[i][j]==1){
                    temp[i][j]++;
                    move(i,j,temp);
                }
            }
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(temp[i][j]>1){
                    temp[i][j]=0;
                }
            }
        }
        
        ball=temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        arr = new int[n][n];
        ball = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            ball[sc.nextInt()-1][sc.nextInt()-1] = 1;
        }
        for(int i=0;i<t;i++){
            check_balls();
        }
        

        int answer=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(ball[i][j]==1){
                    answer++;
                }
            }
        }
        System.out.print(answer); 
    }
}