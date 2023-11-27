import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        int sum1=0;
        int sum2=0;
        for (int i=0;i<m2;i++){
            if (i<m1){
                sum1+=arr[i];
            }
            sum2+=arr[i];
        }
        sum1+=d1;
        sum2+=d2;
        System.out.println(sum2-sum1);
    }
}