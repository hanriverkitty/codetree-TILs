import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        char k = arr[1];
        char l = arr[0];
        for(int i=0;i<str.length();i++){
            if (arr[i]==k){
                arr[i]=l;
            }
            
        }
        String s = String.join(arr);
        System.out.println(s);
    }
}