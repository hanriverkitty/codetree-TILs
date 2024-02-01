import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = a+b; 
        String abs = Integer.toString(ans);
        String[] arr = abs.split("");
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("1")){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}