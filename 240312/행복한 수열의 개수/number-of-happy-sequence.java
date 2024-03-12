import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int answer=0;
        for (int i=0;i<n;i++){
            int temp=-1;
            int cnt=1;
            int temp1=-1;
            int cnt1=1;
            for(int j=0;j<n;j++){                
                if (arr[i][j] != temp){
                    temp = arr[i][j];
                }
                else if (arr[i][j]==temp){
                    cnt++;                    
                }
                if(cnt==m){
                    answer++;
                    break;
                }
            }
            for(int k=0;k<n;k++){                
                if (arr[k][i] != temp1){
                    temp1 = arr[k][i];
                }
                else if (arr[k][i]==temp1){
                    cnt1++;                    
                }
                if (cnt1==m){
                    answer++;
                    break;
                } 
            }
            
        }
        System.out.println(answer);
    }
}