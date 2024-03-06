import java.util.*;
public class Main {
    public static int n;
    public static int k;
    public static ArrayList<Integer> arr = new ArrayList<>();


    public static void cal(int a){
        if(a>=n){
            for (int num:arr){
                System.out.print(num+" ");
            }
            System.out.println();
            return;
        }

        for (int i=1;i<=k;i++){
            if (arr.size()>=2 && arr.get(arr.size()-1)==arr.get(arr.size()-2) && arr.get(arr.size()-1)==i){
                continue;
            }
            arr.add(i);
            cal(a+1);
            arr.remove(arr.size()-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        cal(0);
    }
}