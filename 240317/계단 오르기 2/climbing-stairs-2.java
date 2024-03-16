import java.util.*;
public class Main {
    static int min = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[][] dp = new int[n][4];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(n==3){
            System.out.print(arr[0]+arr[2]+arr[1]);
            return;
        }
        if(n==2){
            System.out.print(arr[0]+arr[1]);
            return;
        }
        dp[0][0] = min;
        dp[0][1] = arr[0];
        dp[0][2] = min;
        dp[0][3] = min;
        dp[1][0] = arr[1];
        dp[1][1] = min;
        dp[1][2] = arr[0]+arr[1];
        dp[1][3] = min;
        for (int i=3;i<n;i++){
            for(int j=0;j<4;j++){
                if (j==0){
                    dp[i][j] = dp[i-2][j]+arr[i];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j-1],dp[i-2][j])+arr[i];
                }
            }
        }
        int answer=0;
    for(int i=0;i<4;i++){
        answer = Math.max(answer,dp[n-1][i]);
    }
    System.out.print(answer);   
    }
}