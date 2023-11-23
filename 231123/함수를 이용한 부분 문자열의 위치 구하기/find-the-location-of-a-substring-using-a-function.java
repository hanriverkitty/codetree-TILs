import java.util.*;
public class Main {
    public static String arr;
    public static void go(String find){
        for (int i=0;i<arr.length()-find.length()+1;i++){
            String subStr = arr.substring(i,i+find.length());
            if (subStr.equals(find)){
                System.out.println(i);
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        arr = sc.nextLine();
        String find = sc.next();
        go(find);
        // 여기에 코드를 작성해주세요.
    }
}