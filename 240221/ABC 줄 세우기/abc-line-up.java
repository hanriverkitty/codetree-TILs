import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i;j++){
                if((int)arr[j-1]>(int)arr[j]){
                    char temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}