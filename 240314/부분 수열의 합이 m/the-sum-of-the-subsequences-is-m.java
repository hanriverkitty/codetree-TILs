import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        int m = sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] dp = new int[m+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<n;i++){
            for(int j=m;j>=1;j--){
                if(j>=arr[i]){
                    if(dp[j-arr[i]]==Integer.MAX_VALUE){
                        continue;
                    }
                    dp[j] = Math.min(dp[j],dp[j-arr[i]]+1);
                }
            }
        }
        if(dp[m]!=Integer.MAX_VALUE){
            System.out.print(dp[m]);
        }else System.out.print(-1);
        
    }
}