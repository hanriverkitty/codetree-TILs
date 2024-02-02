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
        Arrays.sort(arr,(a,b)->a[1]-b[1]);
        System.out.println(Arrays.deepToString(arr));
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i][0]);
            min_idx=i;
        }
        System.out.println(Math.min(arr[n-1][1]-arr[min_idx][0]-(arr[min_idx][1]-arr[min_idx][0]),arr[n-1][1]-arr[min_idx][0]-(arr[n-1][1]-arr[n-1][0])));
    }
}