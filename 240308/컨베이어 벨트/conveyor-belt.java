import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        Deque<Integer> dq1 = new ArrayDeque<>();
        Deque<Integer> dq2 = new ArrayDeque<>();
        for (int i=0;i<n;i++){
            dq1.addLast(sc.nextInt());
        }
        for (int i=0;i<n;i++){
            dq2.addLast(sc.nextInt());
        }
        
        for (int i=0;i<t;i++){
            dq1.addFirst(dq2.pollLast());
            dq2.addFirst(dq1.pollLast());           
        }
        for (int i=0;i<n;i++){
            System.out.print(dq1.pollFirst()+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++){
            System.out.print(dq2.pollFirst()+" ");
        }
    }
}