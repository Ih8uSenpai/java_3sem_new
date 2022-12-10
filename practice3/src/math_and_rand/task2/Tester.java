package math_and_rand.task2;
import java.util.*;
public class Tester {
    int n;
    ArrayList<Circle> arr = new ArrayList<>();
    public Tester(int n){
        this.n = n;
    }
    public Circle max_circle(){
        int max = -999999;
        Circle ans = new Circle();
        for (Circle el : arr)
            if (el.radius > max){
                max = el.radius;
                ans = el;
            }
        return ans;
    }
    public Circle min_circle(){
        int min = 999999;
        Circle ans = new Circle();
        for (Circle el : arr)
            if (el.radius < min){
                min = el.radius;
                ans = el;
            }
        return ans;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n = in.nextInt();
        Tester tester = new Tester(n);
        for (int i = 0; i < n; i++){
            Circle circle = new Circle();
            circle.rand_set();
            tester.arr.add(circle);
        }
        System.out.println("All circles:");
        for (int i = 0; i < n; i++){
            System.out.println(tester.arr.get(i).toString());
        }
        Collections.sort(tester.arr, Comparator.comparing(Circle::getRadius));
        System.out.println("Sorted All circles:");
        for (int i = 0; i < n; i++){
            System.out.println(tester.arr.get(i).toString());
        }
        System.out.println("max is");
        System.out.println(tester.max_circle().toString());
        System.out.println("min is");
        System.out.println(tester.min_circle().toString());
    }

}
