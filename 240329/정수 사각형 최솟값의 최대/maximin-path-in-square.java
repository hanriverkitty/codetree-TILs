import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] dp = new int[n][n];
        // 최좌측 열의 초기값을 설정해줍니다.
        dp[0][0] = arr[0][0];
        for(int i = 1; i < n; i++)
            dp[i][0] = Math.min(dp[i-1][0], arr[i][0]);
    
        // 최상단 행의 초기값을 설정해줍니다.
        for(int j = 1; j < n; j++)
            dp[0][j] = Math.min(dp[0][j-1], arr[0][j]);

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = Math.min(Math.max(dp[i-1][j], dp[i][j-1]), arr[i][j]);
            }
        }
        System.out.println(dp[n-1][n-1]);
    }
}