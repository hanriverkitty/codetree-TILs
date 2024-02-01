import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = sc.next();
        String[] arr = sc.next().split("");
        int len = str.length();
        for (int i=0;i<arr.length;i++){
            if (arr[i].equals("L")){
                str = str.substring(1)+str.substring(0,1);
                
            }
            else if(arr[i].equals("R")){
                str = str.substring((len-1))+str.substring(0,len-1);
                
            }
        }
        System.out.print(str);
    }
}