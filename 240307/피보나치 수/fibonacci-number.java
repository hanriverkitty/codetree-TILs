import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[46];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        for (int i=3;i<46;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.print(arr[n]);
    }
}