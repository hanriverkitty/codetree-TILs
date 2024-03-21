import java.util.*;
public class Main {
    public static int[][] arr;
    public static int n;
    public static int max;
    public static List<Integer> make = new ArrayList<>();
    public static void color(int time){
        if(time==n){
            int sum=0;

            //순서쌍 조합 생성 후 max 값 찾기
            for (int i=0;i<make.size();i++){
                sum += arr[i][make.get(i)];
            }
            max = Math.max(sum,max);
            return;
        }

        //순서쌍에서 두번째 수에 들어갈 중복되지 않은 조합 생성
        for(int i=0;i<n;i++){
            if (make.contains(i)) continue;
            make.add(i);
            color(time+1);
            make.remove(make.size()-1);
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        color(0);
        System.out.println(max);
    }
}