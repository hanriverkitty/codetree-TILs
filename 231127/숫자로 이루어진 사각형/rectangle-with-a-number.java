import java.util.*;
public class Main {
    public static void printNum(int n){
        int cnt=1;
        for (int i=0;i<n;i++){
        
            for (int j=0;j<n;j++){
                if (cnt==10){
                    cnt=1;
                }
                System.out.print(cnt+" ");
                cnt++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printNum(num);
    }
    
}