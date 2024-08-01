package Ex6_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    }



    public static Object[] filter(Object[] objects, FilterInterface filterInterface) {

        List list = new ArrayList();
        for (int i = 0; i < objects.length; i++) {//прохождение по всему массиву
            Object element = objects[i];

            boolean answer = filterInterface.apply(element);

            if(answer == false){
                list.add(element);
            }
        }
        Object[] objects1 = new Object[list.size()];
        System.arraycopy(list, 0,objects1,0,list.size());
        return objects1;

    }


}
