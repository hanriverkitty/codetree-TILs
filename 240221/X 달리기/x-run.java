import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        for (int i=1;i<5001;i++){
            if(i*(i+1)-i>n){
                continue;
            }
            min = Math.min(n-(i*(i+1)-i)+2*i-1,min);
        }
        System.out.println(min);
    }
}