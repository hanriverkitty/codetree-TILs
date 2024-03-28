import java.util.*;
import java.awt.Point;
public class Main {
    public static int n;
    public static ArrayList<Point> arr = new ArrayList<>();
    public static int max=1;
    public static ArrayList<Point> comb = new ArrayList<>();
    public static void search(int time,int next){
        if(time==n){
            max = Math.max(max,comb.size()-1);
        }
        for(int i=next;i<n;i++){
            if (duplicate(arr.get(i))){
                comb.add(arr.get(i));
                search(time+1,next+1);
                comb.remove(comb.size()-1);
            }
        }
    }
    public static boolean duplicate(Point point){
        for(int i=1;i<comb.size();i++){
            if(!(comb.get(i).y<point.x)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        comb.add(new Point(0,0));
        for (int i=0;i<n;i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            arr.add(new Point(x1,x2));
        }
        // 정렬
        Collections.sort(arr, new Comparator<Point>(){
		@Override
		public int compare(Point s1, Point s2){
		return Integer.compare(s1.x, s2.x);
        }
        });
        search(0,0);
        System.out.println(max);
    }
}