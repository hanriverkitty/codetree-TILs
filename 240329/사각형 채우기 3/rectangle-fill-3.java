import java.util.*;
public class Main {
    public static final int DIV = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 2;
        if(n>=2){
        arr[1] = 7;
        }
        if(n>=3){
            arr[2]=22;
        }
        for(int i=3;i<n;i++){
            arr[i] = (2*arr[i-1] + 3*arr[i-2])%DIV;
            for(int j=i-3;j>=0;j--){
                arr[i] = (arr[i] + arr[j]*2)%DIV;
            }
        }
        System.out.println(arr[n-1]);
    }
}