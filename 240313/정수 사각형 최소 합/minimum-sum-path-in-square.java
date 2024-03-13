import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int[][] dp = new int[n+1][n+1];
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        dp[1][n]=arr[1][n];
        for(int i=n-1;i>=1;i--){
            dp[1][i] = dp[1][i+1]+arr[1][i];
        }
        for(int i=2;i<=n;i++){
            dp[i][n] = dp[i-1][n]+arr[i][n];
        }
        for(int i=2;i<n+1;i++){
            for(int j=n-1;j>=1;j--){
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j+1])+arr[i][j];
            }
        }
        System.out.println(dp[n][1]);
    }
}