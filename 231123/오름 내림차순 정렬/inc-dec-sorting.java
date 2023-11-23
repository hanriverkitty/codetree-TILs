import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int [] arr = sc.nextLine().split(" ");
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}