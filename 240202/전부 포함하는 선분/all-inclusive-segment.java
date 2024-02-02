import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int min = 99999;
        int max = 0;
        int min_idx=0;
        int max_idx=0;
        int min_len=0;
        int max_len=0;

        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
       if(arr[0][1]-arr[0][0]>arr[n-1][1]-arr[n-1][0]){
        System.out.println(arr[n-1][1]-arr[1][0]+1);
       }
       else if(arr[0][1]-arr[0][0]<arr[n-1][1]-arr[n-1][0]){
        System.out.println(arr[n-2][1]-arr[0][0]+1);
       }
    }
}