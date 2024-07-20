package Ex10;

public class Ex10Main extends Shape {
    static double u;

    public static void main(String[] args) {

        Box box = new Box();
        Ball ball = new Ball();
        Cylinder cylinder = new Cylinder();
        Pyramid pyramid = new Pyramid();

        cylinder.setHeight(3);
        cylinder.setRadius(2);
        ball.setRadius(0);
        pyramid.setSide(4);
        pyramid.setHeight(2);

        ball.setBallSquare(ball.square());
        cylinder.setCylinderSquare(cylinder.square());
        pyramid.setPyramidSquare(pyramid.square());

        box.foo();
    }


}
