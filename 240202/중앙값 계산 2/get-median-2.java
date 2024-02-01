import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i=0;i<n;i++){
            arr.add(sc.nextInt());
            if(i%2==0){
                Collections.sort(arr);
                System.out.print(arr.get((int)i/2)+" ");
            }
            

        }
    }
}