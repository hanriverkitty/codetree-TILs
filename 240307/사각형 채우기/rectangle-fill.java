import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1001];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<1001;i++){
            arr[i]=(arr[i-2]+arr[i-1])%10007;
        }
        System.out.print(arr[n]);
    }
}