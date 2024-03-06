import java.util.*;
public class Main {
    public static ArrayList<Integer>[] arr;
    public static boolean[] visited;
    public static int cnt=0;
    public static void DFS(int a){
        for(int i=0; i<arr[a].size();i++){
            int now = arr[a].get(i);
            if(!visited[now]){
                cnt++;
                visited[now] = true;
                DFS(now);
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new ArrayList[n+1];
        for (int i=1;i<=n;i++){
            arr[i] = new ArrayList<Integer>();
        }
        for (int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }
        visited = new boolean[n+1];
        Arrays.fill(visited,false);
        DFS(1);
        System.out.print(cnt);
    }
}