package Ex6_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] ob = new Object[2];
        ob[1] = 1;
        IsNullFilter isNullFilter = new IsNullFilter();

        filter(ob, isNullFilter);
    }


    public static Object[] filter(Object[] objects, FilterInterface filterInterface) {
        List list = new ArrayList();
        for (int i = 0; i < objects.length; i++) {//прохождение по всему массиву
            Object element = objects[i];

            boolean answer = filterInterface.apply(element);

            if (answer == false) {
                list.add(element);
            }
        }

        Object[] obj = new Object[list.size()];

        for (int n = 0; n < list.size(); n++) {
            obj[n] = list.get(n);
        }
        return obj;

    }
}
