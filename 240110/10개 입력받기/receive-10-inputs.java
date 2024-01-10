import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int cnt = -1;
        int sum = 0;
        for (int i=0;i<10;i++){
            int a = sc.nextInt();
            if (a==0){
                break;
            }
            arr[i]=a;
            cnt++;
            sum+=a;
        }
        double average = 0L;
        average = (double)sum/(cnt+1);
        System.out.printf("%d %.1f",sum,average);
    }
}