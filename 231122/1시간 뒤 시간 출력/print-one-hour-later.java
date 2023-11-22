import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] b = a.split(":");
        System.out.printf("%d:%d",Integer.parseInt(b[0])+1,Integer.parseInt(b[1]));
    }
}