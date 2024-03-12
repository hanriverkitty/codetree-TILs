import java.util.*;
public class Main {
    static String[] arr = new String[]{"1","22","333","4444"};
    static ArrayList<String> strings = new ArrayList<>();
    static int n;
    public static void make(String a){
        // 붙인 글자가 자릿수가 동일하다면 ArrayList에 추가
        if (a.length()==n){
            strings.add(a);
            return;
        }

        // n보다 작다면 재귀로 새로운 글자 붙이기
        if (a.length()<n){
            for (String str:arr){
                //다른 글자들을 붙여서 재귀호출
                // a = a+str 을 할 경우 재귀에서 돌아왔을 때 a값이 변경되므로 temp를 매개변수로 전달
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