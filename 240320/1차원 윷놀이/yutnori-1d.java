import java.util.*;
public class Main {
    public static int[] arr;
    public static int[] toy;
    public static int n;
    public static int max;
    public static int k;
    public static int m;
    public static void go(int time){
        //말이 m을 넘어 계속 continue 됐을경우 종료조건에 안올 수 있다
        max = Math.max(max,calc()); 
        if(time==n){        
            return;
        }
        
        //말의 개 수 동안 전진, 이미 말이 도착점에 도달했을 경우 터치 X
        for(int i=0;i<k;i++){
            if(toy[i]>=m){
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
        //1번이 시작점이므로 -1
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