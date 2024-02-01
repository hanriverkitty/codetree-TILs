import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(go(arr[0],arr,1));
    }
    public static int go(int num, int[] arr,int i){
        if(i==arr.length){
            return num;
        }
        num = (int)num*arr[i]/gcd(num,arr[i]);
        return go(num,arr,i+1);
        
    }
    public static int gcd(int a,int b){
        if(a%b==0){
            return b;
        }
        return gcd(b,a%b);
    }
}