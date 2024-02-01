import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i=0;i<n;i++){
            sum += sc.nextInt();
        }
        String sum1 = Integer.toString(sum);
        System.out.print(sum1.substring(1)+sum1.substring(0,1));
    }
}