import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double convert = a*30.48;
        System.out.printf("%.1f",convert);
    }
}