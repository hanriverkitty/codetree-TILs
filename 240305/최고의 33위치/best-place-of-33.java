import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (i+2<=n-1 && j+2<=n-1){
                    int cnt=0;
                for (int k=0;k<3;k++){
                    for (int l=0;l<3;l++){
                    if (arr[i+k][j+l]==1){
                        cnt++;
                    }
                }
                }
                max = Math.max(cnt,max);
                }
               
            }
        }
        System.out.println(max);
    }
}