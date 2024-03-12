import java.util.*;
public class Main {
    static String[] arr = new String[]{"1","22","333","4444"};
    static ArrayList<String> strings = new ArrayList<>();
    static int n;
    public static void make(String a){
        if (a.length()==n){
            strings.add(a);
            return;
        }
        if (a.length()<n){
            for (String str:arr){
                String temp = a+str;
                make(temp);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=0;i<4;i++){
            make(arr[i]);
        }

            System.out.println(strings.size());

    }
}