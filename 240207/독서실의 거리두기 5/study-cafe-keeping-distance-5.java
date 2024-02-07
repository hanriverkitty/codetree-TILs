import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        String str = sc.next();
        for (int i=0;i<n;i++){
            char a = str.charAt(i);
            arr[i] = a-'0';
        }
        int ans=0;
        for (int i=0;i<n;i++){
            int[] num = Arrays.copyOf(arr,arr.length);
            if(arr[i]==1){
                continue;
            }else{
            num[i]=1;
            int cnt=9999;
            int temp=Integer.MAX_VALUE;
            int cnt_a=0;
            for(int j=0;j<n;j++){
                if(num[j]==0){
                    cnt++;
                }else{
                    temp = Math.min(temp,cnt);
                    cnt=1;
                
                }    
            }
            ans = Math.max(ans,temp);
            }
        }
        System.out.println(ans);
    }
}