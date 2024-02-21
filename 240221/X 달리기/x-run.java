import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 변수 선언 및 입력
        int n = sc.nextInt();

        int time = 0;
        int dist = n;
        int speed = 1;

        while(true) {
            dist -= speed;
            time++;

            if(dist == 0)
                break;

            
            // 속도를 1 더 높이면, 시그마 speed+1 까지 이동가능 
            if(dist >= (speed + 1) * (speed + 2) / 2)
                speed++;
            
            
            // 속도를 유지하면, 시그마 speed 만큼 이동 가능
            else if(dist >= speed * (speed + 1) / 2) {
                
            }

            // 위 둘을 만족하지 못하면 반드시 속도를 줄여야한다
            else
                speed--;
        }
        
        System.out.print(time);
    }
}