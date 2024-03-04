import java.util.*;
public class Main {
    public static final int MAX_N = 100000;
    public static int[] mergedArr = new int[MAX_N];
    public static void sort(int[] arr,int low, int high){
        if (low<high){
            int mid = (low+high)/2;
            sort(arr,low,mid);
            sort(arr,mid+1,high);
            merge_sort(arr,low,mid,high);
        }
    }

    public static void merge_sort(int[] arr,int low, int mid, int high){
        int i = low;
        int j = mid+1;
        int k = low;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                mergedArr[k] = arr[i];
                k++;
                i++;
            }
            else{
                mergedArr[k] = arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            mergedArr[k] = arr[i];
            k++;
            i++;
        }
        while(j<=high){
            mergedArr[k] = arr[j];
            k++;
            j++;
        }
        for (int l=low;l<=high;l++){
            arr[l] = mergedArr[l];
        }
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr,0, n - 1);

        for(int i = 0; i < n; i++)
            System.out.print(mergedArr[i] + " ");
    }
}