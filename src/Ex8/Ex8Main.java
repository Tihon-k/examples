package Ex8;

public class Ex8Main {
    private static double func (double x){
       return Math.sqrt(Math.cos(Math.pow(x, 5)) + Math.pow(x, 4) - 345.3 * x - 23);
    }

    private static double foo(double start, double end){
        if (end - start <= 0.001){
            return start;
        }
        double x=start+(end-start)/2;

        if (func(x) * func(start)>0){
            return foo(start, x);
        } else {
            return foo(x,end);
        }
    }

    public static void main(String[] args) {
        System.out.println(foo(0,10));
    }



}
