import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int sum =0 ;
        for(int i=0;i<arr.length;i++){
            sum +=Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}