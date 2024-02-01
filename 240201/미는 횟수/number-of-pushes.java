import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int cnt=0;
        for(int i=0;i<str1.length();i++){
            str1 = str1.substring(1)+str1.substring(0,1);
            cnt++;
            if(str1.equals(str2)){
                System.out.print(cnt);
                return;
            }
        }
        System.out.print(-1);
        // 여기에 코드를 작성해주세요.
    }
}