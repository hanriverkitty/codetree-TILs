import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = a.charAt(0)+"a"+a.substring(2,a.length()-2)+"a"+a.charAt(a.length()-1);
        System.out.println(b);
    }   
}