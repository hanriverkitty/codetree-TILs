import java.util.*;
public class Main {
    public static int k=0;
    public static int n=0;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void cal(int b){
        if (b>=n){
            for(int i=0;i<arr.size();i++){
                System.out.print(arr.get(i)+ " ");
            
            }
            System.out.println();
            return;
        }
        for (int j=1;j<=k;j++){
            arr.add(j);
            cal(b+1);
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