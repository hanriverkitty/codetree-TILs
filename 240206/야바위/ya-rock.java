import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i=0;i<n;i++){
            for (int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i=0; i<3; i++){
            int[] game = new int[3];
            game[i]=1;
            int cnt=0;
            for (int j=0; j<n;j++){
                int temp = game[arr[j][0]-1];
                game[arr[j][0]-1]=game[arr[j][1]-1];
                game[arr[j][1]-1]=temp;
                if(game[arr[j][2]-1]==1){
                    cnt++;
                }
            }
            ans = Math.max(ans,cnt);
        }
        System.out.println(ans);
    }
}