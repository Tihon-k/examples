package Ex8;

import java.util.ArrayList;
import java.util.List;

public class Ex8Main {
//    private static double func (double x){
//       return Math.sqrt(Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23);
//    }
//
//    private static double foo(double start, double end){
//        if (end - start <= 0.001){
//            return start;
//        }
//        double x=start+(end-start)/2;
//
//        if (func(x) * func(start)>0){
//            return foo(start, x);
//        } else {
//            return foo(x,end);
//        }
//    }

    public static void main(String[] args) {

       // System.out.println(foo(0,10));

        List<Double> list = new ArrayList<>();
        list.add(1d);
        list.add(2d);
        list.add(3d);

        for (int i=0; i<list.size(); i++){
            System.out.println(i +". " +list.get(i));
        }
    }



}
