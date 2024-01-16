import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int a = 1;
        int cnt = n-1;
        int cnt1 = n-1;
        int num = -1;
        for (;cnt1>-1;cnt1--){
            
            while(cnt>=0 && cnt<=n-1){
                
                arr[cnt][cnt1]=a;
                a++;
                cnt+=num;
            }
            num*=-1;
            if(cnt==-1){
                cnt=0;
            }
            if(cnt==n){
                cnt=n-1;
            }
            
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}