package Ex9;

public class Box extends Shape {


    public Box(double boxSize) {
        this.volume = boxSize;
    }

    Ball ball = new Ball(1);
    Cylinder cylinder = new Cylinder(1,1);
    Pyramid pyramid = new Pyramid(1,1);


    public boolean add(Shape shape) {
        double n  = volume - (ball.volume + cylinder.volume + pyramid.volume);
        if (n >= 0) {
            return true;
        } else return false;
    }
}
