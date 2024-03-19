import java.util.*;
public class Main {
    public static int[] arr;
    public static int[] toy;
    public static int n;
    public static int max;
    public static int k;
    public static int m;
    public static void go(int time){
        if(time==n){
            max = Math.max(max,calc());
            return;
        }
        for(int i=0;i<k;i++){
            if(toy[i]>=m){
                i++;
                continue;
            }
            toy[i] = toy[i]+arr[time];
            go(time+1);
            toy[i] = toy[i]-arr[time];
        }
    }
    public static int calc(){
        int cnt=0;
        for(int a:toy){
            if(a>=m){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt()-1;
        k = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        toy = new int[k];
        go(0);
        System.out.print(max);
    }
}