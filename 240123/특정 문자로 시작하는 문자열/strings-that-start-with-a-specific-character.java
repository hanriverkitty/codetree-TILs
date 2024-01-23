import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        char a = sc.next().charAt(0);
        int cnt=0;
        int avg = 0;
        for(String str:arr){
            if (str.charAt(0)==a){
                cnt++;
                avg+=str.length();
            }
        }
        System.out.printf("%d %.2f",cnt,(double)avg/cnt);
    }
}