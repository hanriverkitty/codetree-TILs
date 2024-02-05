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
        int ans = 1;
        int day = 0;
        List<Integer> arr = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
            while(true){

                if(m1==m2 && d1==d2){
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