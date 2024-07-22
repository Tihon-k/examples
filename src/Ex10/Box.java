package Ex10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box extends Shape implements Comparable {

    public Box(double boxSize) {
        this.volume = boxSize;
    }


    public boolean add(Shape shape) {
        this.volume  = this.volume - shape.getVolume();

        List<Double> list = new ArrayList<>();

        Collections.sort(list);

        if (this.volume >= 0) {
            return true;
        } else
            return false;
    }




    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
