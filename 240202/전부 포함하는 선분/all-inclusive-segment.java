import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        int min = 99999;
        int max = 0;
        int a=0;
        int b=0;
        

        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr,(k,l)->k[1]-l[1]);
        
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i][0]);
        }
        
        a = (arr[n-2][1]-min);
        
        Arrays.sort(arr,(k,l)->k[0]-l[0]);
        
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i][1]);
        }
        b = (max-arr[1][0]);
        if(max==arr[0][1]){
            System.out.print(a+b-(arr[0][1]-arr[0][0]));
        }else{
        System.out.print(Math.min(a,b));
        }
    }
}