import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] arr = sc.nextLine().split(" ");
        int [] arr1 = new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arr1[i]=Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
        Integer[] arr2 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println();
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }

    }
}