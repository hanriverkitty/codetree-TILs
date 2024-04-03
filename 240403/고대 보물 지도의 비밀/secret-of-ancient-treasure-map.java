import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[][] dp = new int[n+1][k+1];
        
        dp[0][0]=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                if(arr[i]>0){
                    dp[i+1][j] = Math.max(arr[i],dp[i][j]+arr[i]);
                }
                else if(arr[i]<0){
                    dp[i+1][j+1] = Math.max(arr[i],dp[i][j]+arr[i]);
                }
            }
        }
        for(int i=0;i<n+1;i++){
            System.out.println(Arrays.toString(dp[i]));
        }
    }
}