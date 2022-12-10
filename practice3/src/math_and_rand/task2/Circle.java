package math_and_rand.task2;
import java.util.*;
public class Circle {
    public Point center = new Point();
    public int radius;
    public void rand_set()
    {
        center.x = (int)(Math.random() * 100);
        center.y = (int)(Math.random() * 100);
        radius = (int)(Math.random() * 100);
    }

    public int getRadius() {
        return radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
