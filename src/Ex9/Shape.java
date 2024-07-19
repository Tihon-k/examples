package Ex9;

public class Shape {
    public double square(){
        Ball ball = new Ball();
        Cylinder cylinder = new Cylinder();
        Pyramid pyramid = new Pyramid();
        double all = ball.ballSquare() + cylinder.cylinderSquare() + pyramid.pyramidSquare();
        return all;
    }
}
