import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        sum=(int)sum/n;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<sum){
                ans += sum-arr[i];
            }
        }
        System.out.println(ans);
    }
}