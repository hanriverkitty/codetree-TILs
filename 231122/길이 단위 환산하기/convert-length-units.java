import java.io.*;
public class Main {
    public static void main(String[] args) throws IOExecption {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        double convert = a*30.48;
        System.out.printf("%.f",convert);
    }
}