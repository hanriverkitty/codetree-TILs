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

            //행 탐색
            for(int j=0;j<n;j++){   
                // 전꺼와 다르면 값을 바꾸고 그동안 셋던 연속된 개수 초기화             
                if (arr[i][j] != temp){
                    temp = arr[i][j];
                    cnt=1;
                }
                else 
                    cnt++;                    
                
                // 연속된 개수가 m을 넘으면 더 이상 찾을 필요가 없으므로 탐색종료
                if(cnt==m){
                    answer++;
                    break;
                }
            }

            //열 탐색
            for(int k=0;k<n;k++){
                // 전꺼와 다르면 값을 바꾸고 그동안 셋던 연속된 개수 초기화                
                if (arr[k][i] != temp1){
                    temp1 = arr[k][i];
                    cnt1=1;
                }
                else 
                    cnt1++;                    
                
                // 연속된 개수가 m을 넘으면 더 이상 찾을 필요가 없으므로 탐색종료
                if (cnt1==m){
                    answer++;
                    break;
                } 
            }
            
        }
        System.out.println(answer);
    }
}