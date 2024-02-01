import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = str.indexOf("e");
        String str1 = str.substring(0,i)+str.substring(i+1);
        System.out.print(str1);
    }
}