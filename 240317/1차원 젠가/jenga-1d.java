import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<2;i++){
            int s1 = sc.nextInt();
            int e1 = sc.nextInt();
            int[] temp = new int[arr.length-(e1-s1+1)];
            int cnt = 0;
            for (int j=0;j<arr.length;j++){                
                if (j>=(s1-1) && j<=(e1-1)){
                    continue;
                }
                temp[cnt] = arr[j];
                cnt++;
            }
            arr=temp;
        }
        System.out.println(arr.length);
        for(int i:arr){
            System.out.println(i);
        }

        
    }
}