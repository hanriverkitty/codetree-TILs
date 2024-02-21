import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[101];
        for (int i=0;i<n;i++){
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int l=j;l<=k;l++){
                arr[l]+=1;
            }
        }
        for (int num:arr){
            if(num==n-1){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
        }
}