package Ex6_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] ob = new Object[4];
        ob[0] = 1;
        ob[2] = 2;
        for (int b = 0; b<ob.length; b++){
            System.out.println(ob[b]);
        }

        IsNullFilter isNullFilter = new IsNullFilter();
        for (Object o : ob = filter(ob, isNullFilter)) {
        }

        for (int i = 0; i <ob.length; i++){
            System.out.println(ob[i]);
        }
    }


    public static Object[] filter(Object[] objects, FilterInterface filterInterface) {
        List list = new ArrayList();
        for (int i = 0; i < objects.length; i++) {//прохождение по всему массиву
            Object element = objects[i];

            boolean answer = filterInterface.apply(element);

            if (!answer) {
                list.add(element);
            }
        }

        Object[] obj = null;

        obj = list.toArray(new Object[list.size()]);

        return obj;

    }
}
