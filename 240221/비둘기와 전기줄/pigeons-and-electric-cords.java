import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[11];
        for (int i=0;i<n;i++){
            arr[i]=2;
        }
        int cnt=0;
        for (int i=0;i<n;i++){
            int k = sc.nextInt();
            int l = sc.nextInt();
            if (arr[k]==2){
                arr[k]=l;
            }
            if(arr[k]!=l){
                cnt++;
                arr[k]=l;
            }
        }
        System.out.println(cnt);
        
    }
}