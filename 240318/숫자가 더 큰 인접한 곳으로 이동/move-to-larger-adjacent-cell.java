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

        int[] dx = new int[]{1,-1,0,0};
        int[] dy = new int[]{0,0,-1,1};

        int now_x = r-1;
        int now_y = c-1;
        System.out.print(arr[now_x][now_y]+" ");
        while(true){
            int cnt=0;
            for(int i=0;i<4;i++){
                int x = now_x+dx[i];
                int y = now_y+dy[i];                
                if(x>=0 && y>=0 && x<n && y<n){
                    if(arr[x][y]>arr[now_x][now_y]){
                        System.out.print(arr[x][y]+" ");
                        now_x = x;
                        now_y = y;
                        cnt=0;
                        break;
                    }
                    else cnt++;
                }
                
            }
            if (cnt!=0) break;
            
            
        }    

    }
}