import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum=0;
        
        for(int i=0;i<n;i++){
            sum+=sc.nextDouble();
        }
        sum/=(double)n;
        System.out.println(String.format("%.1f",sum));
        if(sum>=4.0){
            System.out.println("Perfect");
        }else if(sum>=3.0){
            System.out.println("Good");
        }else{
            System.out.println("Poor");
        }
        
    }
}