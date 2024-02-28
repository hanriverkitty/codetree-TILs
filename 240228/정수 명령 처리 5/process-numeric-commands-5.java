import java.util.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            String command = sc.next();
            switch (command){
                case "push_back":
                    arr.add(sc.nextInt());
                    break;
                case "get":
                    System.out.println(arr.get(sc.nextInt()-1));
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "pop_back":
                    arr.remove(arr.size()-1);
                    break;
            }

        }
    }
}