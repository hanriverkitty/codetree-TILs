import java.util.*;
public class Main {
    static int MAX = Integer.MAX_VALUE-2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i] = sc.nextInt();
        }
        int[] dp = new int[m+1];
        Arrays.fill(dp,MAX);        
        dp[0] = 0;
        for(int i=1;i<m+1;i++){
            for(int j=0;j<n;j++){
                if(coins[j]<=i){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        if(dp[m]!=MAX){
            System.out.print(dp[m]);
        }else{
            System.out.print(-1);
        }
        
    }
}