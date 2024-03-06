import java.util.*;
public class Main {
    public static int n;
    public static final int MAX = 8;
    public static boolean[] visited = new boolean[MAX+1];
    public static ArrayList<Integer> arr = new ArrayList<>();

    public static void cal(int a){
        if(a>=n){
            for (int num : arr){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }
        for (int i=1;i<=n;i++){
            if (visited[i]) continue;
            visited[i]=true;
            arr.add(i);
            cal(a+1);
            arr.remove(arr.size()-1);
            visited[i]=false;

        }
    }

    public static void main(String[] args) {
        Arrays.fill(visited,false);
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        cal(0);
    }

}