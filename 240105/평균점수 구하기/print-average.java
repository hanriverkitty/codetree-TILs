import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        for (int i=0;i<8;i++){
            sum+=sc.nextDouble();
        }
        System.out.printf("%.1f",(double)sum/8);
        // 여기에 코드를 작성해주세요.
    }
}