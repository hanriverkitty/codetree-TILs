import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        int point = arr[x-1][y-1];

        // 십자모양의 값은 0으로 초기화
        for (int i=x-point;i<x+point-1;i++){
            if(i>=0 && i<n){
                
                arr[i][y-1]=0;
            }
        }
        for (int i=y-point;i<y+point-1;i++){
            if(i>=0 && i<n){
                arr[x-1][i]=0;
                
            }
        }
        
        
        int[][] temp = new int[n][n];
        for(int i=0;i<n;i++){
            int idx=n-1;
            for(int j=n-1;j>=0;j--){
                if(arr[i][j]!=0){
                    temp[i][idx]=arr[i][j];
                    idx--;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
}