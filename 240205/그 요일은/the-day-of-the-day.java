import java.util.*;
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