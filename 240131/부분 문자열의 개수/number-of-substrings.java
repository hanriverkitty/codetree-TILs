import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt=0;
        for(int i=0;i<a.length()-1;i++){
        
                
                if((a.charAt(i)==(b.charAt(0)))&&(a.substring(i,i+b.length()).equals(b))){
                    cnt++;
                }
            
        }
        System.out.println(cnt);
    }
}