import java.util.Scanner;

public class Main {
    public static final int MAX_NUM = 20;
    
    // 전역 변수 선언:
    public static int n, m;
    public static int[] A = new int[MAX_NUM];
    
    public static int ans;
    
    public static void findMaxXor(int currIdx, int cnt, int currVal) {
        if(cnt == m) {
            ans = Math.max(ans, currVal);
            return;
        }
    
        if(currIdx == n) 
            return;
    
        // currIdx index 에 있는 숫자를 선택하지 않은 경우
        findMaxXor(currIdx + 1, cnt, currVal);
        
        // currIdx index 에 있는 숫자를 선택한 경우
        findMaxXor(currIdx + 1, cnt + 1, currVal ^ A[currIdx]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        m = sc.nextInt();
        for(int i = 0; i < n; i++) 
            A[i] = sc.nextInt();

        findMaxXor(0, 0, 0);
        
        // 출력:
        System.out.print(ans);
    }
}