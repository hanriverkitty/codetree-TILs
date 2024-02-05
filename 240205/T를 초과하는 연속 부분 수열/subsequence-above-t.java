import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans = 0;
        int cnt=0;
        for (int i=0;i<n;i++){
            if(arr[i]>t){
                cnt++;
            }else{
                ans = Math.max(ans,cnt);
                cnt=0;
                
            }
        }
        System.out.println(ans);
    }
}