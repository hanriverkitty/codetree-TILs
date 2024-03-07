import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=0;
        arr[2]=1;
        if (n<=2){
            System.out.println(arr[n]);
            return;
        }
        arr[3]=1;
        for (int i=4;i<n+1;i++){
            arr[i] = arr[i-2]+arr[i-3];
        }
        System.out.println(arr[n]);
    }
}