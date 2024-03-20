import java.util.*;
public class Main {
    static List<Integer> num = new ArrayList<>();
    static int n,m,max;
    static int[] arr;
    
    public static void back(int time,int idx,int val){
        if(time==m){
            max = Math.max(max,val);
            return;
        }
        if(time>m){
            return;
        }
        for(int i=idx;i<n;i++){            
            back(time+1,i+1,val ^ arr[i]);            
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        back(0,0,0);
        System.out.println(max);
    }
}