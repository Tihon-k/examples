package Ex9;

public class Pyramid extends Shape{
    private double side = 5;
    private double height = 6;


    public double pyramidSquare(){
        double pyramid = side * (side + 2*height);
        return pyramid;
    }
}
