import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int [n];
        dp[0]=0;
    
        for (int i=1;i<n;i++){           
            int max = 0;
            boolean can = false;
            for(int j=i-1;j>=0;j--){
                if(arr[j]>0 && dp[j]==0){
                    max=0;
                }
                if(arr[j]-(i-j)>=0 && arr[j]>0){
                    max = Math.max(dp[j]+1,max);
                }
            }
            dp[i] = max;
            
        }
        
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}