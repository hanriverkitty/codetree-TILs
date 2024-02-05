/* import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String date = sc.next();
        int ans = 0;
        int day = 0;

        //요일 기록
        List<String> arr1 = new ArrayList<>(Arrays.asList("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"));
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));

        //월요일 보다 A요일이 얼마나 더 앞에 있는지 확인
        int count = arr1.indexOf(date);
        
        //m2 d2에 있는 월요일 탐색
            while(true){
                if(m1==m2 && d1==d2){
                    //day가 A요일의 인덱스보다 크면 A요일이 한번더 포함될 수 있다
                    if (day>=count){
                        ans++;
                    }
                    System.out.println(ans);
                    return;
                }
                d1++;
                day++;
                if (day==7){
                    day=0;
                    ans++;
                }
                if (m1==2 && d1==29){
                    m1++;
                    d1=0;
                    continue;
                }
                if (arr.contains(m1) && d1==31){
                    d1=0;
                    m1++;
                }else if(d1==30){
                    d1=0;
                    m1++;
                }
                
                
            }
        
    }
}
*/
import java.util.Scanner;

public class Main {
    public static int numOfDays(int m, int d) {
        // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다. 
        int[] days = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += d;
        
        return totalDays;
    }
    
    public static int numOfDay(String s) {
        // 간단한 비교를 위해 요일을 숫자로 나타내줍니다.
        if(s.equals("Mon")) return 0;
        else if(s.equals("Tue")) return 1;
        else if(s.equals("Wed")) return 2;
        else if(s.equals("Thu")) return 3;
        else if(s.equals("Fri")) return 4;
        else if(s.equals("Sat")) return 5;
        return 6;
    }
    
    public static int ans;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();

        int startDate = numOfDays(m1, d1);
        int endDate = numOfDays(m2, d2);
        int k = numOfDay(A);
        int ans = (int)(endDate-startDate)/7;
        int rest = (int)(endDate-startDate)%7;
        if(rest+k>=7){
            ans++;
        }
        System.out.println(ans);
    }
}