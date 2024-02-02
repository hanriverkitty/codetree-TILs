import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        while(true){
            int max=0;
            int min=9999999;
            int max_idx=0;
            int min_idx=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                    max_idx=i;
                }
                if(arr[i]<min){
                    min = arr[i];
                    min_idx = i;
                }
                
                
            }
            if (max==min){
                System.out.println(cnt);
                break;
            }
            arr[max_idx]-=(int)(max-min)/2;
            arr[min_idx]+=(int)(max-min)/2;
            cnt+=(int)(max-min)/2;
            
        }
    }
}