import java.util.*;
class student {
    String name;
    int height;
    int weight;
    public student(String name, int a,int b){
        this.name = name;
        this.height = a;
        this.weight = b;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        student[] arr = new student[n];
        for (int i=0;i<n;i++){
            arr[i] = new student(sc.next(),sc.nextInt(),sc.nextInt());
        }
        Arrays.sort(arr,(a,b)->a.height-b.height);
        for(student a:arr){
            System.out.println(a.name+" "+a.height+" "+a.weight);
        }
    }
}