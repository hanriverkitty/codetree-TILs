import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int str1 = sc.nextLine().length();
        int str2 = sc.nextLine().length();
        int str3 = sc.nextLine().length();
        int max1 = Math.max(Math.max(str1,str2),str3);
        int min1 = Math.min(Math.min(str1,str2),str3);
        System.out.println(max1-min1);
        
    }
}