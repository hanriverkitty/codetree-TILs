import java.util.*;
public class Main {
    public static int calculate(int n, int m){
        while(m>0){
            int temp = n;
            n=m;
            m=temp%n;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(calculate(n,m));
    }
}