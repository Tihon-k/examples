package Ex9;

public class Box extends Shape {


    public Box(double boxSize) {
        this.volume = boxSize;
    }

    Ball ball = new Ball();
    Cylinder cylinder = new Cylinder();
    Pyramid pyramid = new Pyramid();


    public boolean add(Shape shape) {
        double n  = volume - (ball.volume + cylinder.volume + pyramid.volume);
        if (n >= 0) {
            System.out.println(n);
            return true;
        } else return false;
    }
}
