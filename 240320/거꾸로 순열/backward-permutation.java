import java.util.*;
public class Main {
    static int n;
    static List<Integer> arr = new ArrayList<>();
    public static void cal(int time){
        if(time==n){
            for(int a:arr){
                System.out.print(a+" ");
            }
            System.out.println();
            return;
        }
        for(int i=n;i>=1;i--){
            if (arr.contains(i)) continue;
            arr.add(i);
            cal(time+1);
            arr.remove(arr.size()-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cal(0);
    }
}