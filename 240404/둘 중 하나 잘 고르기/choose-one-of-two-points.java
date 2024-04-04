import java.util.*;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static final int MAX_N = 100;

    public static int n;

    public static int[] red = new int[MAX_N * 2 + 1];
    public static int[] blue = new int[MAX_N * 2 + 1];

    // dp[i][j][k] :
    // i번째 카드 쌍까지 고려해봤을 때
    // 지금까지 빨간색 카드는 정확히 j장 뽑았고
    // 지금까지 파란색 카드는 정확히 k장 뽑았다 했을 때
    // 얻을 수 있는 뽑힌 숫자들의 최대 합
    public static int[][][] dp = new int[MAX_N * 2 + 1][MAX_N * 2 + 1][MAX_N * 2 + 1];


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        for(int i = 1; i <= 2 * n; i++) {
            red[i] = sc.nextInt();
            blue[i] = sc.nextInt();
        }


        for(int i = 1; i <= 2 * n; i++) {
            // i개의 카드 쌍에 대해 전부 카드 선택을 완료했을 때
            // 지금까지 뽑은 빨간색 카드 수가 j이고
            // 지금까지 뽑은 파란색 카드 수가 k였을 때
            // 가능한 선택한 카드 숫자의 최대합을 계산합니다.
            
            // 이러한 상황을 만들기 위한 선택지는 크게 2가지 입니다.
            for(int j = 0; j <= i; j++) {
                for(int k = 0; k <= i; k++) {
                    // Case 1
                    // i번째 카드 쌍에서 빨간색 카드를 선택하여
                    // 최종적으로 빨간색이 j개, 파란색이 k개가 된 경우입니다.
                    // 따라서 i - 1번째 카드 쌍 까지는 빨간색을 j - 1개, 파란색을 k개 뽑았어야 비로소
                    // i번째에 빨간색 카드를 선택하게 되므로서 빨간색이 j개, 파란색이 k개가 될 수 있습니다.
                    // 이 경우 dp[i - 1][j - 1][k] 에 i번째 카드 쌍 중 빨간색 카드에 적혀있는 숫자인
                    // red[i]를 더한 것이 한 가지 경우가 됩니다.
                    // 당연히 j가 0보다 커야지만이 만들어질 수 있는 경우입니다.
                    if(j > 0)
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - 1][k] + red[i]);

                    // Case 2
                    // i번째 카드 쌍에서 파란색 카드를 선택하여
                    // 최종적으로 빨간색이 j개, 파란색이 k개가 된 경우입니다.
                    // 따라서 i - 1번째 카드 쌍 까지는 빨간색을 j개, 파란색을 k - 1개 뽑았어야 비로소
                    // i번째에 파란색 카드를 선택하게 되므로서 빨간색이 j개, 파란색이 k개가 될 수 있습니다.
                    // 이 경우 dp[i - 1][j][k - 1] 에 i번째 카드 쌍 중 파란색 카드에 적혀있는 숫자인
                    // blue[i]를 더한 것이 한 가지 경우가 됩니다.
                    // 당연히 k가 0보다 커야지만이 만들어질 수 있는 경우입니다.
                    if(k > 0)
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j][k - 1] + blue[i]);
                }
            }
        }

        // 총 2 * n개의 카드 쌍에 대해 전부 카드 선택을 완료했을 때
        // 빨간색 카드, 파란색 카드 모두 각각 n개씩 뽑았다 했을 때
        // 가능한 최대 합에 해당하는 dp 값을 출력합니다.
        System.out.println(dp[2 * n][n][n]);
    }
}