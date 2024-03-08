import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        dp[0]=1;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<i;j++){
                int temp;
                if(arr[j]>=arr[i]){
                    temp = dp[j];
                }
                else temp = dp[j]+1;
                dp[i] = Math.max(dp[i],temp);
            }
            
        }
        System.out.print(Arrays.stream(dp).max().getAsInt());
    }
}