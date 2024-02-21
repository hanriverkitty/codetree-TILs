import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = n;
        for (int i=1;i<5001;i++){
            if(i*(i+1)-i>n){
                continue;
            }
            if((n-(i*(i+1)-i))/i>0){
                int div = (n-(i*(i+1)-i))/i;
                min = Math.min(n-(i*(i+1)-i+div*i)+2*i-1+div,min);
            }else{
            min = Math.min(n-(i*(i+1)-i)+2*i-1,min);
            }
        }
        System.out.println(min);
    }
}