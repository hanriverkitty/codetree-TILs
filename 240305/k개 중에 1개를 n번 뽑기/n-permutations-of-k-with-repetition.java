import java.util.*;
public class Main {
    public static int k=0;
    public static ArrayList<Integer> arr = new ArrayList<>();
    public static void cal(int a, int b){
        System.out.println(a+" "+b);
        if (b==k && a==k){
            return;
        }
        else if(b==k){
            b=1;
            a++;
            cal(a,b);
        }
        else {
            b++;
            cal(a,b);
                        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        int n = sc.nextInt();
        cal(1,1);

        
    }
}