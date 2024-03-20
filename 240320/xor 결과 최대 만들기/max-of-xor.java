import java.util.*;
public class Main {
    static List<Integer> num = new ArrayList<>();
    static int n,m,max;
    static int[] arr;
    
    public static void back(int time){
        if(time==m){
            max = Math.max(max,calc());
            return;
        }
        for(int i=0;i<n;i++){
            if(num.contains(arr[i])) continue;
            num.add(arr[i]);
            back(time+1);
            num.remove(num.size()-1);
        }

    }
    public static int calc(){
        int result=num.get(0);
        for(int i=1;i<num.size();i++){
            result = result ^ num.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        back(0);
        System.out.println(max);
    }
}