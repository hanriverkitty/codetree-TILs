import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int cnt = -1;
        for (int i=0;i<10;i++){
            int a = sc.nextInt();
            if (a==0){
                break;
            }
            arr[i]=a;
            cnt++;
        }
        for (;cnt>=0;cnt--){
            System.out.print(arr[cnt]+" ");
        }
    }
}