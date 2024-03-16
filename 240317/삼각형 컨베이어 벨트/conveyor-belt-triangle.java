import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Integer> dq = new ArrayDeque<>();
        int n = sc.nextInt();
        int t = sc.nextInt();
        for(int i=0;i<3*n;i++){
            dq.addLast(sc.nextInt());
        }
        for(int i=0;i<t;i++){
            dq.addFirst(dq.pollLast());
        }
        int cnt=0;
        for(int i=0;i<3*n;i++){
            System.out.print(dq.pollFirst()+" ");
            if (cnt==n){
                System.out.println();
                cnt=0;
            }
        }
    }
}