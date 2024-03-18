import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        int now_x = r-1;
        int now_y = c-1;
        while(true){
            int max=0;
            int max_x;
            int max_y;
            for(int i=0;i<4;i++){
                int x = now_x+dx[i];
                int y = now_y+dy[i];
                if(x>=0 && y>=0 && x<n && y<n){
                    if(arr[x][y]>arr[now_x][now_y]){
                        max = Math.max(max,arr[x][y]);
                        max_x=x;
                        max_y=y;
                    }
                }
            }
            
            now_x = max_x;
            now_y = max_y;
            if(now_x>=0 && now_y>=0 && now_x<n && now_y<n){
                System.out.print(max+" ");
            }
            else break;
        }    

    }
}