package Ex10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex10Main extends Shape implements Comparable, Square {
    public static void main(String[] args) {
        Box box = new Box();
        double[] ball1 = box.setBall();
        double ballSquare = ball1[1];

        double[] pyramid1 = box.setPyramid();
        double pyramidSquare = pyramid1[2];

        double[] cylinder1 = box.setCylinder();
        double cylinderSquare = cylinder1[2];

        List<Double> list = new ArrayList<>();
        list.add(ballSquare);
        list.add(pyramidSquare);
        list.add(cylinderSquare);

        Collections.sort(list);


        for (double square: list) {
            System.out.println("какое-то место по тяжести " +square);
            //Интересно, а как сделать нумерацию в array list?
            //Пытался найти не нашел.....
        }

        box.foo();
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
