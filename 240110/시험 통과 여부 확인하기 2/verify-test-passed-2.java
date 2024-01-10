import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][4];
        int fail =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<4;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j=0;j<n;j++){
            int sum=0;
            for (int i=0;i<4;i++){
                sum+=arr[j][i];
            }
            if (sum/4>=60){
                System.out.println("pass");
                fail++;
            }
            else{
                System.out.println("fail");
                
            }
            
        }
        System.out.println(fail);
    }
}