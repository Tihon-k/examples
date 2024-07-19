package Ex9;

public class Box extends Shape {
    double box = 200;
    double n;




    public double add() {
        Shape shape = new Shape();
        n = shape.square();
        box = box - n;
        return box;

    }


    public void foo(){
        Box box = new Box();
        double m = box.add();
        if (m>=0){
            System.out.println(m);
        } else {
            System.out.println(false);
        }
    }




}
