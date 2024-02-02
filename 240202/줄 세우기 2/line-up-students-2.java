import java.util.*;
class Student implements Comparable<Student>{
    int h;
    int w;
    int num;
    public Student(int h,int w,int i){
        this.h=h;
        this.w=w;
        this.num = i;
    }
    @Override
    public int compareTo(Student a){
        if(a.h==this.h){
               return a.w-this.w;
            }else{
               return this.h-a.h;
            }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i=0; i<n;i++){
            arr[i] = new Student(sc.nextInt(),sc.nextInt(),i+1);
        }
        Arrays.sort(arr);
        for(Student a:arr){
            System.out.println(a.h+" "+a.w+" "+a.num);
        }
    }
}