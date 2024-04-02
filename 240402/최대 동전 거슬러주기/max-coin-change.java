import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
        }
        
        int[] dp = new int[m+1];
        Arrays.fill(dp,Integer.MIN_VALUE);
        dp[0]=0;
        for(int i=1;i<m+1;i++){
            for(int j=0;j<n;j++){
                if(dp[i]==Integer.MIN_VALUE) continue;
                if(i-coins[j]>=0){
                    dp[i] = Math.max(dp[i-coins[j]]+1,dp[i]);
                }
            }
        }
        System.out.print(dp[m]>0 ? dp[m] : -1);
    }
}