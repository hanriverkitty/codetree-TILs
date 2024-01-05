import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        for(int i=0;i<10;i++){
            int a=sc.nextInt();
            
            if (a>=250){
                break;
            }
            arr[i]=a;
        }
        int cnt=0;
        int sum=0;
        double average=0;
        for(int i=0;i<10;i++){
            sum+=arr[i];
            if(arr[i]==0){
                break;
            }
            cnt++;
        }
        average=((double)sum/(double)cnt);
        System.out.println(sum+" "+String.format("%.1f",average));
    }
}