import java.util.*;
public class Main {
    public static void calculate(int a, int b, int c, int d){
        int ans = (c*60+d)-(a*60+b);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        calculate(a,b,c,d);
    }
}