import java.util.*;
public class Main {
    public static int n;
    public static int m;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void cal(int a,int k){
        if(a>=m){
            for(int num :arr){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }
        for (int i=k;i<=n;i++){
            if (arr.size()==0 || arr.get(arr.size()-1)<i){
                arr.add(i);
                cal(a+1,k+1);
                arr.remove(arr.size()-1);
            }
            
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cal(0,1);
    }
}