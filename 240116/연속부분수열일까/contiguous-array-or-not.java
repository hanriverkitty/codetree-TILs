import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if(n1<n2){
            System.out.println("No");
            return;
        }
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        for (int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for (int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        for (int i=0;i<n1;i++){
            if (arr1[i]==arr2[0]){
                int cnt=0;
                for (int j=1;j<n2;j++){
                    if(arr1[i+j]!=arr2[j]){
                        break;
                    }
                    else{
                        cnt++;
                    }
            }
            if(cnt==n2-1){
                System.out.println("Yes");
                return;
            }
            }
        }
        System.out.println("No");
    }
}