import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        
        }for (int i=0;i<n;i++){
            int x_min=Integer.MAX_VALUE;
            int x_max=0;
            int y_min=Integer.MAX_VALUE;
            int y_max=0;
            for (int j=0;j<n;j++){
                if(j==i){ continue;
                }
                else{
                x_min = Math.min(x_min,arr[j][0]);
                x_max = Math.max(x_max,arr[j][0]);
                y_min = Math.min(y_min,arr[j][1]);
                y_max = Math.max(y_max,arr[j][1]);
                }
                
            }
            System.out.println(x_max+" "+" "+x_min+" "+y_max+" "+y_min);
            ans = Math.min(ans,(int)(x_max-x_min)*(y_max-y_min));
        }
        System.out.println(ans);
    }
}