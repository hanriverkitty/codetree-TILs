import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        for (int i=0;i<str.length;i++){
            if((char)str[i]>=65 && (char)str[i]<=90){
                System.out.print((char)(str[i]+32));
            }
            else{
                System.out.print((char)(str[i]-32));
            }
        }
    }
}