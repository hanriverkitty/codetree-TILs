import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i=arr[0];i<arr[n-1];i++){
            int temp = 0;
            for (int j=0;j<n;j++){
                if(arr[j]>=i+k){
                    temp+=arr[j]-i-k;
                }else if(arr[j]<=i){
                    temp+=i-arr[j];
                }
            }
            ans = Math.min(ans,temp);
        }
        System.out.println(ans);
    }
}