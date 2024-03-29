import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.fill(dp,-13);
        dp[0]=0;
        for(int i=1;i<=n;i++){            
            for(int j=0;j<i;j++){
                if (dp[j]==-13) continue;
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                
                
            }
            
        }
        System.out.print(Arrays.stream(dp).max().getAsInt());
    }
}