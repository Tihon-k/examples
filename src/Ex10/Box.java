package Ex10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box extends Shape implements Comparable {

    public Box(double boxSize) {
        this.volume = boxSize;
    }

    Ball ball = new Ball();
    Cylinder cylinder = new Cylinder();
    Pyramid pyramid = new Pyramid();


    public boolean add(Shape shape) {
        double n  = volume - (ball.volume + cylinder.volume + pyramid.volume);

        List<Double> list = new ArrayList<>();
        list.add(ball.volume);
        list.add(cylinder.volume);
        list.add(pyramid.volume);

        Collections.sort(list);

        if (n >= 0) {
            System.out.println(list);
            System.out.println(n);
            return true;
        } else {
            System.out.println(list);
            return false;}
    }




    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
