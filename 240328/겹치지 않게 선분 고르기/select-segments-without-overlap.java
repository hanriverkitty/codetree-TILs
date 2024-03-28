import java.util.*;
import java.awt.Point;
public class Main {
    public static int n;
    public static ArrayList<Point> arr = new ArrayList<>();
    public static int max=1;
    public static ArrayList<Point> comb = new ArrayList<>();
    public static int cnt=0;
    public static void search(int time,int next){
        if(time==n){
            max = Math.max(max,comb.size()-1);
            return;
        }
        if(n-time+comb.size()<max) return;

        
        if (duplicate(arr.get(time))){
            comb.add(arr.get(time));
            search(time+1,next+1);
            cnt++;
            comb.remove(comb.size()-1);
        }else{
            search(time+1,next+1);
            cnt++;
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