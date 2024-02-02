import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] arr1 = Arrays.copyOfRange(arr,0,n);
        int[] arr2 = Arrays.copyOfRange(arr,n,arr.length);
        int max = 1000000000;
        for (int i=0;i<arr1.length;i++){
            max = Math.min(max,arr2[i]-arr1[i]);
            
        }
        System.out.println(max);
    }
}