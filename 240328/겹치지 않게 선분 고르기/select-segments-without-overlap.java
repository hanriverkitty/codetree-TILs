import java.util.*;
import java.awt.Point;
public class Main {
    public static int n;
    public static ArrayList<Point> arr = new ArrayList<>();
    public static int max=0;
    public static ArrayList<Point> comb = new ArrayList<>();
    public static void search(int time){
        if(time==n){
            if(duplicate()){
                max = Math.max(max,comb.size());
            }
            return;
        }
        if(n-time+comb.size()<max) return;

       
        comb.add(arr.get(time));
        search(time+1);
        comb.remove(comb.size()-1);
    
        search(time+1);
        
    }
    public static boolean duplicate(){
        for(int i=0;i<comb.size();i++){
            for (int j=i+1;j<comb.size();j++){
                if(!(comb.get(i).y<comb.get(j).x)) return false;
            }
            
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
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
        search(0);
        System.out.println(max);
    }
}