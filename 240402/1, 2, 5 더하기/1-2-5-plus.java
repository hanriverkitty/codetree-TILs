import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] num = new int[]{1,2,5};
        int[] dp = new int[n+1];
        dp[0]=1;
        for(int i=1;i<n+1;i++){
            for(int a:num){
                if(i-a>=0){
                dp[i] = (dp[i] + dp[i-a])%10007;
                }
            }
            dp[i]=dp[i]%10007;
        }
        System.out.print(dp[n]);
    }
}