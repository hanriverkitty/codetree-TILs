import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] n  = sc.next().split("");
        List<Integer> list_arr = new ArrayList<>();
        for (int i=0;i<n.length;i++){
            list_arr.add(Integer.parseInt(n[i]));
        }
        Collections.reverse(list_arr);
        int plus=0;
        int temp=1;
        for(int i=0;i<list_arr.size();i++){
            plus+=(list_arr.get(i)*temp);
            temp*=a;
        }
        List<Integer> answer = new ArrayList<>();
        while(true){
            if(plus<b){
                answer.add(plus);
                break;
            }
            answer.add(plus%b);
            plus/=b;
        }
        for(int i=answer.size()-1;i>=0;i--){
            System.out.print(answer.get(i));
        }
    }
}