import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int min = Integer.MAX_VALUE;
        min = Math.min(Math.abs(B-A),min);
        min = Math.min(Math.abs(A-x)+Math.abs(B-y),min);
        min = Math.min(Math.abs(A-y)+Math.abs(B-x),min);
        System.out.print(min);
    }
}