package Ex10;

public abstract class Shape implements Square, SetSomething{

    @Override
    public double [] setBall(){
        Ball ball = new Ball();
        double[] ball1 = new double[2];

        ball.setRadius(1);
        ball1[0] = ball.getRadius();

        ball1[1] = ball.square();

        return ball1;
    }

    @Override
    public double[] setPyramid(){
        Pyramid pyramid = new Pyramid();
        double[] pyramid1 = new double[3];

        pyramid.setSide(4);
        pyramid1[0] = pyramid.getSide();

        pyramid.setHeight(2);
        pyramid1[1] = pyramid.getHeight();

        pyramid1[2] = pyramid.square();

        return pyramid1;
    }

    @Override
    public double[] setCylinder(){
        Cylinder cylinder = new Cylinder();
        double[] cylinder1 = new double[3];

        cylinder.setHeight(1);
        cylinder1[0] = cylinder.getHeight();

        cylinder.setRadius(2);
        cylinder1[1] = cylinder.getRadius();

        cylinder1[2] = cylinder.square();

        return cylinder1;
    }

    @Override
    public double square() {
        double[] ball1= setBall();
        double[] pyramid1 = setPyramid();
        double[] cylinder1 = setCylinder();


        double all = ball1[1] + pyramid1[2] + cylinder1[2];
        return all;
    }
}
