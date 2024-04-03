import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n+1];

        for(int i=1;i<n+1;i++){
            arr[i] = sc.nextInt();
        }

        int[][] dp = new int[n+1][k+1];
        int max =0;
        for(int i=1;i<n+1;i++){
                if(arr[i]>=0){
                    for(int j=0;j<k+1;j++){
                        dp[i][j] = Math.max(dp[i-1][j]+arr[i], dp[i][j]);
                        max = Math.max(dp[i][j],max);
                    }                   
                }
                else{
                    for(int j=1;j<k+1;j++){
                        dp[i][j] = Math.max(dp[i-1][j-1]+arr[i],dp[i][j]);
                        max = Math.max(dp[i][j],max);
                    }                    
                }           
        }
        
        System.out.print(max);
    }
}