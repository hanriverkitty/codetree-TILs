import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 2;
        if(n>=2){
        arr[1] = 7;
        }
        for(int i=2;i<n;i++){
            arr[i] = (2*arr[i-1] + 3*arr[i-2])%1000000007;
        }
        System.out.println(arr[n-1]);
    }
}